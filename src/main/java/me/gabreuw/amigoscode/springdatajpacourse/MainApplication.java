package me.gabreuw.amigoscode.springdatajpacourse;

import me.gabreuw.amigoscode.springdatajpacourse.model.entities.Student;
import me.gabreuw.amigoscode.springdatajpacourse.model.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student maria = new Student(
					"Maria",
					"Jones",
					"maria.jones@amigoscode.edu",
					21
			);
			repository.save(maria);
		};
	}

}
