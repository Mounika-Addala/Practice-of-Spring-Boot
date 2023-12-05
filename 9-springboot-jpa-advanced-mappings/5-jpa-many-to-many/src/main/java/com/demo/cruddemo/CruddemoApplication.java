package com.demo.cruddemo;

import com.demo.cruddemo.dao.AppDao;
import com.demo.cruddemo.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
             // createCourseAndStudents(appDao);
			//findCourseAndStudents(appDao);
			//findStudentAndCourses(appDao);
			//addMoreCourseForStudent(appDao);
			//deleteCourse(appDao);
			deleteStudent(appDao);
			 };

	}

	private void deleteStudent(AppDao appDao) {
		int id=1;
		appDao.deleteStudentById(id);
	}

	private void deleteCourse(AppDao appDao) {
		int id=10;
		System.out.println("Deleting course id:"+id);
		appDao.deleteCourseById(id);

	}

	private void addMoreCourseForStudent(AppDao appDao) {
		int id=2;
		Student tempStudent=appDao.findStudentAndCourseByStudentId(id);
		Course tempCourse1=new Course("java");
		Course tempCourse2=new Course("sql");
		tempStudent.addCourse(tempCourse1);
		tempStudent.addCourse(tempCourse2);
		System.out.println(tempStudent);
		System.out.println(tempStudent.getCourses());
		appDao.update(tempStudent);

	}

	private void findStudentAndCourses(AppDao appDao) {
		int id=1;
		Student tempStudent=appDao.findStudentAndCourseByStudentId(id);
		System.out.println(tempStudent);
		System.out.println(tempStudent.getCourses());
	}

	private void findCourseAndStudents(AppDao appDao) {
		int id=10;
		Course tempCourse=appDao.findCourseAndStudentsByCourseId(id);
		System.out.println(tempCourse);
		System.out.println(tempCourse.getStudents());
	}

	private void createCourseAndStudents(AppDao appDao) {
		Course tempCourse=new Course("One Step To Success");

		Student tempStudent1=new Student("Mouni","Addala","mouni@123");
		Student tempStudent2=new Student("Leena","Addala","leena@123");

		tempCourse.addStudent(tempStudent1);
		tempCourse.addStudent(tempStudent2);

		System.out.println(tempCourse);
		System.out.println(tempCourse.getStudents());
		appDao.save(tempCourse);


	}

	private void deleteCourseAndReviews(AppDao appDao) {
          int id=10;
		System.out.println("Deleting course id:"+id);
		appDao.deleteCourseById(id);
	}

	private void retrieveCourseAndReview(AppDao appDao) {
		int id=10;
		Course tempCourse=appDao.findCourseAndReviewsByCourseId(id);
		System.out.println(tempCourse);
		System.out.println(tempCourse.getReviews());

	}

	private void createCourseAndReviews(AppDao appDao) {
		Course tempCourse=new Course("Choose the Right Path");
		tempCourse.addReview(new Review("what a headache"));
		tempCourse.addReview(new Review("Thanks for the guidence"));
		tempCourse.addReview(new Review("Great explanation.."));

		System.out.println("Saving the course");
		System.out.println(tempCourse);
		System.out.println(tempCourse.getReviews());

		appDao.save(tempCourse);

	}


}