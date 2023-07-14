package com.example.demo.controller;

import com.example.demo.model.People;
import com.example.demo.repository.IPeopleRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private IPeopleRepository peopleRepository;

    @GetMapping
    public String view(Model model,
                       @RequestParam(defaultValue = "1") int page) throws IOException {
//        List<Map<String, Object>> students = peopleRepository.getAll();
        int pageSize = 5; // Số lượng phần tử trên mỗi trang
        List<Map<String, Object>> people = peopleRepository.getAll();
        int totalElements = people.size();
        int totalPages = (int) Math.ceil((double) totalElements / pageSize);
        if (page < 1) {
            page = 1;
        } else if (page > totalPages) {
            page = totalPages;
        }
        int startIndex = (page - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, totalElements);
        List<Map<String, Object>> students =people.subList(startIndex, endIndex);
        model.addAttribute("students", students);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", page);
//        List<Map<String, Object>> students = people.stream()
//                .skip(page * pageSize) // Bỏ qua số phần tử cần bỏ qua trên các trang trước
//                .limit(pageSize) // Giới hạn số phần tử trong trang hiện tại
//                .collect(Collectors.toList()); // Lấy danh sách các phần tử trong trang hiện tạiist<Map<String, Object>> students = people.stream()
//                .skip(page * pageSize) // Bỏ qua số phần tử cần bỏ qua trên các trang trước
//                .limit(pageSize) // Giới hạn số phần tử trong trang hiện tại
//                .collect(Collectors.toList()); // Lấy danh sách các phần tử trong trang hiện tại
//        model.addAttribute("students", students);
//        model.addAttribute("page", page);
//        model.addAttribute("totalPage", students.size() / pageSize);
        return "home/index";
    }

}
