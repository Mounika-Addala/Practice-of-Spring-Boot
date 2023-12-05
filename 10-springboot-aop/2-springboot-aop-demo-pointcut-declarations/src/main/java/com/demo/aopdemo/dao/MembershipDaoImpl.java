package com.demo.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao{
    @Override
    public boolean addSillyMember() {
        System.out.println(getClass() + ":DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + ": I am going to sleep now..");

    }
//    @Override
//    public void addSillyMember() {
//
//        System.out.println(getClass() + " : DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
//    }
}
