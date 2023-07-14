package com.example.demo.repository;

import com.example.demo.model.People;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public interface IPeopleRepository extends JpaRepository<People, UUID> {
    public default List<Map<String, Object>> getAll() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String path = "C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\merged.json";
        List<Map<String, Object>> students = mapper.readValue(new File(path),List.class);
        return students;
    }
}
