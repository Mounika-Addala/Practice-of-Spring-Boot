package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

   // @Before("execution(public void com.demo.aopdemo.dao.AccountDao.addAccount())")
//   // @Before("execution(public void updateAccount())")
//    public void beforeAddAccountAdvice(){
//        System.out.println("/n=====>>> Executing @Before advice on method");
//    }
//    @Before("execution(public void add*())")


  // @Before("execution(void add*())")
//    @Before("execution(* add*())")
// @Before("execution(* add*(com.demo.aopdemo.Account, ..))")
  //@Before("execution(* add*(..))")
    @Before("execution(* com.demo.aopdemo.dao.*.*(..))")

   public void beforeAddAccountAdvice(){
       System.out.println("/n=====>>> Executing @Before advice on method");
   }

}
