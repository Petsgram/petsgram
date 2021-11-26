package com.petsgram.mspets.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

public class FileUploadUtil {
    public static void saveFile(String fileName, MultipartFile file) throws IOException {
        String uploadDir = "media/profile-pic/";
        if (fileName.equals("default.jpg")) uploadDir = "media/";
        Path uploadPath = Paths.get(uploadDir);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        if (file.isEmpty()) {
            Files.copy(Objects.requireNonNull(FileUploadUtil.class.getClassLoader().getResourceAsStream("default.jpg")),
                    uploadPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
        } else {
            try (InputStream inputStream = file.getInputStream()) {
                Path filePath = uploadPath.resolve(fileName);
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new IOException("Error saving file: " + fileName, e);
            }
        }
    }
}
