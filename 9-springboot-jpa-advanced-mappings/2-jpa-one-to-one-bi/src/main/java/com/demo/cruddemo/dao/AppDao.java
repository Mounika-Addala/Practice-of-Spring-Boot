package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Instructor;
import com.demo.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;

public interface AppDao {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
    InstructorDetail findInstructorDetailById(int id);
    void deleteinstructorDetailById(int id);
}
