package com.habittracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.habittracker.model.Habit;

public interface HabitRepository extends JpaRepository<Habit, Long> {}
