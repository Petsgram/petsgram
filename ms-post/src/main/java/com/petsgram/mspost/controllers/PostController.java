package com.petsgram.mspost.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petsgram.mspost.models.Image;
import com.petsgram.mspost.models.Post;
import com.petsgram.mspost.repositories.PostRepository;
import com.petsgram.mspost.utils.FileUploadUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@RestController
public class PostController {
    public static final String UPLOAD_POST_PATH = "uploads/post/";
    public static final String URL_DIVISOR = "/";
    public static final String REGEX_URL = "[/\\\\]";
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    /**
     * Method to create a new post with image.
     * @param postJson Post serialized in JSON to be created.
     * @param image Image from the post to be created.
     * @return Response HTTP with the post created.
     * @throws IOException If the post cannot be created.
     */
    @PostMapping(value = "/posts", consumes = "multipart/form-data")
    public ResponseEntity<Post> createPost(@RequestParam("post") String postJson,
                                           @RequestParam("image") MultipartFile image) throws IOException {
        Post post = new ObjectMapper().readValue(postJson, Post.class);
        post.setDate(LocalDateTime.now());
        Post postSaved = postRepository.save(post);
        postSaved = savePostWithImage(image, postSaved);
        return new ResponseEntity<>(postSaved, HttpStatus.CREATED);
    }

    /**
     * Method to save the post image and return the post with the image saved.
     * @param image image to be saved
     * @param postSaved post to be saved
     * @return post with the image saved.
     * @throws IOException if the image cannot be saved
     */
    private Post savePostWithImage(MultipartFile image, Post postSaved) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(image.getOriginalFilename()));
        String uploadDir = UPLOAD_POST_PATH + postSaved.getId();
        String path = FileUploadUtil.saveFile(uploadDir, fileName, image);
        postSaved.setImage(new Image(URL_DIVISOR + path.replaceAll(REGEX_URL, URL_DIVISOR)));
        postSaved = postRepository.save(postSaved);
        return postSaved;
    }

    /**
     * Method to create a new post without image
     * @param post Post to be created
     * @return Response HTTP with the post created.
     */
    @PostMapping(value = "/posts", consumes = "application/json")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        post.setDate(LocalDateTime.now());
        return new ResponseEntity<>(postRepository.save(post), HttpStatus.CREATED);
    }

    /**
     * Method to get all posts ordered by date.
     * @return Response HTTP with all posts ordered by date.
     */
    @GetMapping("/posts")
    public ResponseEntity<Iterable<Post>> getAllPosts() {
        return new ResponseEntity<>(postRepository.findByOrderByDateDesc(), HttpStatus.OK);
    }

    /**
     * Method to get all posts from a pet.
     * @return Response HTTP with all posts from a pet.
     */
    @GetMapping("/posts/{username}")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getAllPostsPet(@PathVariable String username) {
        return postRepository.findByUsername(username);
    }
}

