package com.watcharay.crudapi.config;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    static {
        Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
    }
}


