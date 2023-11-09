package com.database.cruddemo;

import com.database.cruddemo.dao.StudentDao;
import com.database.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CruddemoApplication.class, args);

	}
		@Bean
				public CommandLineRunner commandLineRunner(StudentDao studentDAO){
			      return runner -> {
					  //createStudent(studentDAO);   1 st method
					 // createMultipleStudents(studentDAO);  2nd method
					  //readStudent(studentDAO); 3rd method
					 // queryForStudents(studentDAO);
					  //queryForStudentsByLastName(studentDAO);
					  //updateStudent(studentDAO);
					  //deleteStudent(studentDAO);
					  deleteAllStudent(studentDAO);
				  };
		}

	private void deleteAllStudent(StudentDao studentDAO) {
		System.out.println("Deleting all the students");
		int rowsDelete=studentDAO.deleteAll();
		System.out.println("Deleted row count :"+rowsDelete);
	}

	private void deleteStudent(StudentDao studentDAO) {
		int studentId=3;
		System.out.println("Deleting student id:"+studentId);
		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDao studentDAO) {
           int studentId=4;
		System.out.println("Getting student with id:"+studentId);
		Student student=studentDAO.findById(studentId);
		System.out.println("Updating");
		student.setFirst_name("Madhu");
		studentDAO.update(student);
		System.out.println("Updated student:"+student);

	}


	/*5 th method */
//	private void queryForStudentsByLastName(StudentDao studentDAO) {
//
//		List<Student> student=studentDAO.findByLastName("Addala");
//
//		for (Student tempstudent:student)
//			  {
//				  System.out.println(tempstudent);
//		}
//
//	}

//	private void queryForStudents(StudentDao studentDAO) {
//
//		List<Student> student=studentDAO.findAll();
//		for (Student tempstudent:student) {
//			System.out.println(tempstudent);
//		}
//
//	}
/*3 rd method*/
//	private void readStudent(StudentDao studentDAO) {
//
//		System.out.println("Creating a new student object");
//		Student student1=new Student("Madhuri","Naidu","madhunaidu@123");
//
//		System.out.println("saving the student");
//		studentDAO.save(student1);
//
//		int id=student1.getId();
//		System.out.println("Saved student with id :"+id);
//
//		System.out.println("Retrieving student with id:"+id);
//		Student mystudent=studentDAO.findById(id);
//
//
//		System.out.println("Found the student" +student1);
//
//	}
	/*2nd method*/
//	private void createMultipleStudents(StudentDao studentDAO) {
//		System.out.println("Creating 3 student objects..");
//		Student student2 = new Student("Leena","Addala","leena@addala.com");
//		Student student3 = new Student("Pawan","Kalyan"," pawan@kalyan .com");
//		Student student4 = new Student(" Hasini","Angel","hasini@angel.com");
//
//		System.out.println("Saving the students...");
//		studentDAO.save(student2);
//		studentDAO.save(student3);
//		studentDAO.save(student4);

	}
/* 1st method */
//	private void createStudent(StudentDao studentDAO) {
//		System.out.println("Creating new student object..");
//		Student student1=new Student("Mouni", "Addala",   "mouniaddala@123");
//
//		System.out.println("Saving the student..");
//		studentDAO.save(student1);
//		System.out.println("Saved Student. Generated id :" +student1.getId());
//
//	}



