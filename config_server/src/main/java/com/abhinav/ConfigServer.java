package com.abhinav;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import static org.springframework.boot.SpringApplication.run;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(String[] args) {
        run(ConfigServer.class, args);
    }

}
