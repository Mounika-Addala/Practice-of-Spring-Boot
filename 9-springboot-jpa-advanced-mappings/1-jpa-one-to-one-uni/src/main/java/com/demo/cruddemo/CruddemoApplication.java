package com.demo.cruddemo;

import com.demo.cruddemo.dao.AppDao;
import com.demo.cruddemo.entity.Instructor;
import com.demo.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
		@Bean
				public CommandLineRunner commandLineRunner(AppDao appDao){
			return runner -> {
				//createInstructor(appDao);
				//findInstructor(appDao);
				deleteInstructor(appDao);
				
			};
		}

	private void deleteInstructor(AppDao appDao) {
		int id=3;
		System.out.println("Deleting instructor id:"+id);
		appDao.deleteInstructorById(id);
		System.out.println("its deleted..");
	}

	private void findInstructor(AppDao appDao) {
		int id=2;
		System.out.println("Finding instructor id:"+id);
		Instructor tempInstructor=appDao.findInstructorById(id);
		System.out.println("tempInstructor:"+tempInstructor);
		System.out.println("The associated instructor Detail only:"+tempInstructor.getInstructorDetail());
	}

	private void createInstructor(AppDao appDao) {

//		Instructor tempInstructor=new Instructor("Mouni","Addala","mouni@123");
//
//		InstructorDetail tempInstructorDetail=new InstructorDetail("http://www.mouniaddala.com/youtube","Listening");

		Instructor tempInstructor=new Instructor("Leena","Addala","leena@123");

		InstructorDetail tempInstructorDetail=new InstructorDetail("http://www.leenaaddala.com/youtube","Gardening");

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		System.out.println("Saving instructor:" +tempInstructor);
		appDao.save(tempInstructor);
		System.out.println("Its done now");


	}
}


