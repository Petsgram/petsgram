package com.petsgram.mspost;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public static final String ENDPOINT_PATH = "/uploads/post/**";
    public static final String UPLOAD_POST_PATH = "file:uploads/post/";

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler(ENDPOINT_PATH).addResourceLocations(UPLOAD_POST_PATH);
    }

}
