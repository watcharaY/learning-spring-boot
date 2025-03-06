package com.watcharay.crudapi;

import com.watcharay.crudapi.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudapiApplication {

	public static void main(String[] args) {
		new Config();
		SpringApplication.run(CrudapiApplication.class, args);
	}

}
