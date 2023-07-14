package com.example.demo.repository;

import com.example.demo.model.People;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.FileReader;
import java.util.List;

@EntityScan("com.example.demo.model") // Đặt tên package tương ứng
@EnableJpaRepositories("com.example.demo.repository") // Đặt tên package tương ứng
@SpringBootApplication
public class JsonToDatabaseApplication implements CommandLineRunner {
    @Autowired
    private IPeopleRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(JsonToDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String jsonFilePath = "C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\merged.json";

        // Read data from JSON file
        List<People> people = readJsonData(jsonFilePath);

        // Save data to the database
        personRepository.saveAll(people);

        System.out.println("Data has been saved to the database successfully.");
    }

    private List<People> readJsonData(String jsonFilePath) throws Exception {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(jsonFilePath)) {
            return gson.fromJson(reader, new TypeToken<List<People>>() {
            }.getType());
        }
    }
}
