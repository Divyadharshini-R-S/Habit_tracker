package com.habittracker.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.habittracker.repository.HabitRepository;
import com.habittracker.model.Habit;
import java.util.List;

@Service
public class HabitService {
    private final HabitRepository repo;

    @Autowired
    public HabitService(HabitRepository repo) { this.repo = repo; }

    public Habit create(Habit habit) { return repo.save(habit); }

    public List<Habit> getAll() { return repo.findAll(); }
}
