package com.vineeth.contentcalender.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value="cc")
public record ContentCalenderProperties(String welcomeMessage, String about) {
}
