package ru.spring.git.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private int id;
    private String title;
    private String description;

    @JsonFormat(pattern = "hh:mm:ss dd.MM.yyyy")
    private LocalDateTime creationTime;
}
