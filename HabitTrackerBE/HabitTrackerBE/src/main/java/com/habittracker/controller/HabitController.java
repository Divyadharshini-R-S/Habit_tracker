package com.habittracker.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.habittracker.service.HabitService;
import com.habittracker.model.Habit;
import java.util.List;

@RestController
@RequestMapping("/api/habits")
@CrossOrigin(origins = "http://localhost:3000") // allow CRA dev server
public class HabitController {
    private final HabitService service;

    @Autowired
    public HabitController(HabitService service) { this.service = service; }

    @GetMapping
    public List<Habit> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<Habit> create(@RequestBody Habit habit) {
        Habit saved = service.create(habit);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
