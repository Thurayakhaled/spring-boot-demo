package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner commandLineRunner(String[] args) {
//		return runner->{
//			System.out.println("Hello World");
//		};
//	}
@Bean
public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
	return args -> {
		//createStudent(studentDAO);
		//createMultiStudents(studentDAO);
		//findStudent(studentDAO);
		queryForStudent(studentDAO);
	};
}

	private void queryForStudent(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private void findStudent(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student = new Student("marim","khaled","mariam@gmail.com");
		studentDAO.save(student);
		int id=student.getId();
		Student myStudent=studentDAO.findById(id);
		System.out.println(myStudent);
	}

	private void createMultiStudents(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student1 = new Student("yahia","khaled","yahia@gmail.com");
		Student student2 = new Student("noor","khaled","noor@gmail.com");
		Student student3 = new Student("ahmed","khaled","ahmed@gmail.com");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
		System.out.println("done with id ="+student1.getId());
		System.out.println("done with id ="+student2.getId());
		System.out.println("done with id ="+student3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student = new Student("thorya","khaled","thorya@gmail.com");
		System.out.println("saving student...");
		studentDAO.save(student);
		System.out.println("done with id ="+student.getId());


	}


}
