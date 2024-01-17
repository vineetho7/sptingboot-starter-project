package com.vineeth.contentcalender.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        @NotBlank
        String title,

        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,

        LocalDateTime dataUpdated,
        String url
) {


}
