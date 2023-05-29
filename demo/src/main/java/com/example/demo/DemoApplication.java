package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication {
    static Properties prop = new Properties();

    public static void main(String[] args) {

        String serverPort = "8080";

        try {
            // pobranie numeru portu z pliku konfiguracyjnego 
            prop.load(DemoApplication.class.getClassLoader().getResourceAsStream("application.properties"));
            serverPort = prop.getProperty("server.port");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // wyswietlenie daty uruchomienia, autora oraz portu
        System.out.println("data uruchomienia: " + LocalDateTime.now() + "\nAutor: Cezary Płatek\nport tcp: "+ serverPort);
        SpringApplication.run(DemoApplication.class, args);
    }

}
