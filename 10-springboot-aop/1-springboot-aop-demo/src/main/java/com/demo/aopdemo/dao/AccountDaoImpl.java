package com.demo.aopdemo.dao;

import com.demo.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao{
//    @Override
//    public void addAccount() {
//        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT");
//    }

    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }

//    @Override
//    public void addAccount(Account account) {
//        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT");
//    }
}
