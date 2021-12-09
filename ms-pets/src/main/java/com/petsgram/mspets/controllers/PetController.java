package com.petsgram.mspets.controllers;

import com.petsgram.mspets.exceptions.OwnerNotFoundException;
import com.petsgram.mspets.exceptions.PetNotFoundException;
import com.petsgram.mspets.models.Pet;
import com.petsgram.mspets.models.PetType;
import com.petsgram.mspets.repositories.PetRepository;
import com.petsgram.mspets.utils.FileUploadUtil;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
public class PetController {
    private final PetRepository petRepository;

    /**
     * Pet Controller constructor
     *
     * @param petRepository - pet repository
     */
    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    /**
     * Method to create a new pet with the information of the request and a profile picture
     *
     * @param image         - image of the pet
     * @param username      - username of the pet
     * @param name          - name of the pet
     * @param birthdate     - birthdate of the pet
     * @param type          - type of the pet
     * @param breed         - breed of the pet
     * @param usernameOwner - username of the owner of the pet
     * @return - the pet created
     * @throws IOException - if the image is not valid
     */
    @PostMapping("/pets")
    @CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.OPTIONS})
    Pet newPet(@RequestParam("image") MultipartFile image, @RequestParam("username") String username,
               @RequestParam("name") String name, @RequestParam("birthdate") String birthdate,
               @RequestParam("type") PetType type, @RequestParam("breed") String breed,
               @RequestParam("usernameOwner") String usernameOwner) throws IOException {
        System.out.println("Entro a pet: " + image.getContentType());
        System.out.println(image);
        String filePath = getImagePath(image);
        Pet pet = new Pet(username, name, type, birthdate, breed, usernameOwner, filePath);
        Pet savedPet = petRepository.save(pet);
        FileUploadUtil.saveFile(filePath, image);

        return savedPet;
    }

    /**
     * Method to delete a pet
     *
     * @param username - username of the pet to delete
     * @return - the advice of the operation
     */
    @DeleteMapping("/pets/{username}")
    public String deletePet(@PathVariable String username) {
        Pet pet = petRepository.findById(username).orElse(null);
        if (pet == null) throw new PetNotFoundException("Mascota no encontrada con el username: " + username);
        petRepository.delete(pet);
        return "La mascota se ha eliminado";
    }

    /**
     * Method to update a pet
     *
     * @param pet - pet to update
     * @return - the pet updated
     */
    @PutMapping("/pets")
    Pet updatePet(@RequestBody Pet pet) {
        Pet petToUpdate = petRepository.findById(pet.getUsername()).orElse(null);
        if (petToUpdate == null) throw new PetNotFoundException("Mascota no encontrada");
        if (petToUpdate.getImage() == null) petToUpdate.setImage("default.jpg");
        pet.setImage(petToUpdate.getImage());
        return petRepository.save(pet);
    }

    /**
     * Method to get a pet by its username
     *
     * @param username - username of the pet
     * @return - the pet
     */
    @GetMapping("/pets/{username}")
    public Pet getPet(@PathVariable String username) {
        Pet pet = petRepository.findById(username).orElse(null);
        if (pet == null) throw new PetNotFoundException("Mascota no encontrada");
        return pet;
    }

    /**
     * Method to get all the pets from a user
     *
     * @param usernameOwner - username of the owner
     * @return - the list of pets
     */
    @GetMapping("/pets/my/{usernameOwner}")
    public List<Pet> getMyPet(@PathVariable String usernameOwner) {
        List<Pet> pets = petRepository.findByUsernameOwner(usernameOwner);
        if (pets == null)
            throw new OwnerNotFoundException("No se encontró propietario con el usuario: " + usernameOwner);
        return pets;
    }

    /**
     * Method to get the picture of a pet
     *
     * @param username - username of the pet
     * @return - the picture of the pet
     * @throws IOException - if the image is not valid
     */
    @GetMapping(value = "/pets/{username}/profile-pic", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getImage(@PathVariable String username) throws IOException {
        String path = "media/profile-pic/";
        Pet pet = petRepository.findById(username).orElse(null);
        if (pet == null) throw new PetNotFoundException("Mascota no encontrada");
        if (pet.getImage().equals("default.jpg")) path = "media/";
        Path img = Paths.get(path).resolve(pet.getImage());
        return new FileInputStream(img.toFile()).readAllBytes();
    }

    /**
     * Method to get the image path
     *
     * @param image - image to get the path
     * @return - the path of the image
     */
    private String getImagePath(MultipartFile image) {
        String fileName;
        String fileUrl = "default";
        String extension = ".jpg";
        if (!image.isEmpty()) {
            fileName = StringUtils.cleanPath(Objects.requireNonNull(image.getOriginalFilename()));
            extension = fileName.substring(fileName.lastIndexOf("."));
            fileUrl = UUID.randomUUID().toString();
        }
        return fileUrl + extension;
    }
}