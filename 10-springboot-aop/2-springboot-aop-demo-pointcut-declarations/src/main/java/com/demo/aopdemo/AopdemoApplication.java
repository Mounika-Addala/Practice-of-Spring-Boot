package com.demo.aopdemo;

import com.demo.aopdemo.dao.AccountDao;
import com.demo.aopdemo.dao.MembershipDao;
import com.demo.aopdemo.service.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao, MembershipDao membershipDao, TrafficFortuneService theTrafficFortuneService){
		return runner ->{
//			demoTheBeforeAdvice(accountDao,membershipDao);
			//demoTheAfterReturningAdvice(accountDao);
			//demoTheAfterThrowingAdvice(accountDao);
			//demoTheAfterAdvice(accountDao);
			demoTheAroundAdvice(theTrafficFortuneService);

		};
	}

	private void demoTheAroundAdvice(TrafficFortuneService theTrafficFortuneService) {

		System.out.println("\n Main program: demoTheAroundadvice");
		System.out.println("Calling getFormula()");
		String data= theTrafficFortuneService.getFortune();
		System.out.println("\nMy fortune is:" +data);
		System.out.println("Finished");

	}

	private void demoTheAfterAdvice(AccountDao accountDao) {
		List<Account> theAccounts=null;

		try {
			boolean tripWire=true;
			theAccounts=accountDao.findAccounts(tripWire);
		}
		catch(Exception exc){
			System.out.println("\n\n Main  Program:... caught exception:" +exc);
		}

		System.out.println("\n\n Main Program: demoTheAfterThrowingAdvice");
		System.out.println("-----");

		System.out.println(theAccounts);
		System.out.println("/n");

	}

	private void demoTheAfterThrowingAdvice(AccountDao accountDao) {
		List<Account> theAccounts=null;

		try {
			boolean tripWire=true;
			theAccounts=accountDao.findAccounts(tripWire);
		}
		catch(Exception exc){
			System.out.println("\n\n Main  Program:... caught exception:" +exc);
		}

		System.out.println("\n\n Main Program: demoTheAfterThrowingAdvice");
		System.out.println("-----");

		System.out.println(theAccounts);
		System.out.println("/n");

	}

	private void demoTheAfterReturningAdvice(AccountDao accountDao) {
		List<Account> theAccounts=accountDao.findAccounts();

		System.out.println("\n\n Main Program: demoTheAfterreturningAdvice");
		System.out.println("-----");

		System.out.println(theAccounts);
		System.out.println("/n");

	}

	private void demoTheBeforeAdvice(AccountDao accountDao,MembershipDao membershipDao) {
		Account myAccount=new Account();
		myAccount.setName("Mouni");
		myAccount.setLevel("platinum");

		accountDao.addAccount(myAccount,true);
		accountDao.doWork();

		accountDao.setName("Dolly");
		accountDao.setServiceCode("silver");

		String name=accountDao.getName();
		String code=accountDao.getServiceCode();

		membershipDao.addSillyMember();
		membershipDao.goToSleep();


	}
}
