package com.demo.aopdemo.aspect;

import com.demo.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.security.SignedObject;
import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Around("execution(* com.demo.aopdemo.dao.AccountDao.findAccounts(..))")
    public Object aroundGetFortune(
            ProceedingJoinPoint theProceedingJointPoint) throws Throwable{
        String method=theProceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>> Executing @Around on method:" +method);

        long begin=System.currentTimeMillis();
        Object result=theProceedingJointPoint.proceed();
        long  end=System.currentTimeMillis();

        long duration=end-begin;
        System.out.println("\n=====> Duration:"+ duration /1000.0 + "seconds");


        return result;

    }

    @After("execution(* com.demo.aopdemo.dao.AccountDao.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint){

        String method=theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>> Executing @After on method:" +method);

    }

    @AfterThrowing(
            pointcut = "execution(* com.demo.aopdemo.dao.AccountDao.findAccounts(..))",
            throwing = "theExc"
    )
    public void afterThrowingFindAccountsAdvice(
            JoinPoint theJoinPoint,Throwable theExc){
        String method=theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>> Executing @AfterThrowing on method:" +method);

        System.out.println("\n====>>> The Exception is:"+theExc);

    }

    @AfterReturning(
            pointcut ="execution(* com.demo.aopdemo.dao.AccountDao.findAccounts(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result){

        String method=theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>> Executing @AfterReturning on method:" +method);

        System.out.println("\n====>>> result is :"+result);
        
        convertAccountNameToUpperCase(result);
        System.out.println("\n====>>> result is :"+result);
        
    }

    private void convertAccountNameToUpperCase(List<Account> result) {

        for(Account tempAccount :result){
            String upperCase=tempAccount.getName().toUpperCase();
            tempAccount.setName(upperCase);
        }
    }

    @Before("com.demo.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint){
       System.out.println("/n=====>>> Executing @Before advice on method");

        MethodSignature methodSignature=(MethodSignature)  joinPoint.getSignature();
        System.out.println("Method:" +methodSignature);

        Object[] args=joinPoint.getArgs();

        for(Object tempArg :args){
            System.out.println(tempArg);
            
            if(tempArg instanceof Account){
                Account account=(Account) tempArg;

                System.out.println("account name:" +account.getName());
                System.out.println("account level:" +account.getLevel());
            }
        }



   }



}
