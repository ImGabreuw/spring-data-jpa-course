package me.gabreuw.amigoscode.springdatajpacourse.model.repositories;

import me.gabreuw.amigoscode.springdatajpacourse.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}