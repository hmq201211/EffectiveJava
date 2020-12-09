package com.sftwa.service;

import lombok.var;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Component
public class ReadService {
    @Value("classpath:txt.txt")
    private Resource resource;

    @PostConstruct
    public void init() throws IOException {
        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)
                )
        ) {
            System.out.println(reader.lines().collect(Collectors.joining("")));
        }
    }
}
