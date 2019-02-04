package com.lakshmi.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentsController {

	
	@GetMapping("/studentsList")
	public @ResponseBody
	List<Student>  getStudentsList() {
		List<Student> studentsList = new ArrayList<Student>();
		Student s1=new Student(1, "Lakshmi", "Prasad", "laxmiprasadboppana@gmail.com", "9945669228");
		Student s2=new Student(2, "rajesh", "Boppana", "rajeshboppana@gmail.com", "8123010203");
		Student s3=new Student(3, "Ramesh", "Boppana", "v.ramesh@gmail.com", "98495555448");
		
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		
		return studentsList;
	}
    
}
