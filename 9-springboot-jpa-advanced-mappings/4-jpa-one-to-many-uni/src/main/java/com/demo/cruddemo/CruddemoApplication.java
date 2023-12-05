package com.demo.cruddemo;

import com.demo.cruddemo.dao.AppDao;
import com.demo.cruddemo.entity.Course;
import com.demo.cruddemo.entity.Instructor;
import com.demo.cruddemo.entity.InstructorDetail;
import com.demo.cruddemo.entity.Review;
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
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
			// createCourseAndReviews(appDao);
			// retrieveCourseAndReview(appDao);
			deleteCourseAndReviews(appDao);


		};

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