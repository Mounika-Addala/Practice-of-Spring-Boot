package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Course;
import com.demo.cruddemo.entity.Student;

public interface AppDao {

    void save(Course course);
    Course findCourseAndReviewsByCourseId(int id);

    void deleteCourseById(int id);
    Course findCourseAndStudentsByCourseId(int id);
    Student findStudentAndCourseByStudentId(int id);
    void update(Student student);
    void deleteStudentById(int id);

}
