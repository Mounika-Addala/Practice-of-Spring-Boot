package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    @Pointcut("execution(* com.demo.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution(* com.demo.aopdemo.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* com.demo.aopdemo.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDaoPackage() && ! (getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}


}
