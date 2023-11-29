package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Instructor;
import jakarta.persistence.EntityManager;

public interface AppDao {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
}
