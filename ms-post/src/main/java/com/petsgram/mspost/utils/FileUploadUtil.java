package com.petsgram.mspost.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

/**
 * Utility class for file uploads
 * @author criiscz
 */
public class FileUploadUtil {

    /**
     * Method to upload image to server.
     * @param uploadDir Path to upload directory.
     * @param fileName Name of the file.
     * @param image MultipartFile.
     * @return Path of the uploaded file.
     * @throws IOException If there is an error while uploading the file.
     */
    public static String saveFile(String uploadDir, String fileName, MultipartFile image) throws IOException {
        Path uploadPath = Paths.get(uploadDir);
        String ext = fileName.substring(fileName.lastIndexOf("."));
        if (!Files.exists(uploadPath)) Files.createDirectories(uploadPath);
        Path filePath = uploadPath.resolve(UUID.randomUUID() + ext);
        return saveImage(image, filePath);
    }

    /**
     * Method to save image to server.
     * @param image Image to save.
     * @param filePath Path to save image.
     * @return Path of the saved image.
     * @throws IOException If there is an error while saving the image.
     */
    private static String saveImage(MultipartFile image, Path filePath) throws IOException {
        InputStream inputStream = image.getInputStream();
        Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        return filePath.toString();
    }
}
