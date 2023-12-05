package com.demo.aopdemo.dao;

import com.demo.aopdemo.Account;

public interface AccountDao {
   // void addAccount();
    void addAccount(Account account,boolean vipFlag);
    boolean doWork();
}
