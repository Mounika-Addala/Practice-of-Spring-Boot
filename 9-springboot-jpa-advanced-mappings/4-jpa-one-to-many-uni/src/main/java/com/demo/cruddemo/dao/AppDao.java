package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Course;

public interface AppDao {

    void save(Course course);
    Course findCourseAndReviewsByCourseId(int id);

    void deleteCourseById(int id);

}
