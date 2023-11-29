package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDaoImpl implements AppDao{

    private EntityManager entityManager;
    @Autowired
    public AppDaoImpl(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return  entityManager.find(Instructor.class,id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor tempInstructor=entityManager.find(Instructor.class,id);

         entityManager.remove(tempInstructor);
    }
}
