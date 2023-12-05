package com.demo.aopdemo.dao;

import com.demo.aopdemo.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);

   // void addAccount();
    void addAccount(Account account,boolean vipFlag);
    boolean doWork();

    public String getName() ;


    public void setName(String name)  ;

    public String getServiceCode()  ;

    public void setServiceCode(String serviceCode)  ;


}
