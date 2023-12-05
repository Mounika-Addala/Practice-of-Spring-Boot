package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Course;
import com.demo.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDaoImpl implements AppDao {

    private EntityManager entityManager;

    @Autowired
    public AppDaoImpl(EntityManager entityManager) {

        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Course course) {
        entityManager.persist(course);

    }

    @Override
    public Course findCourseAndReviewsByCourseId(int id) {

        TypedQuery<Course> query= entityManager.createQuery("select c from Course c "
        + "JOIN FETCH c.reviews "
        + "where c.id = :data",Course.class);
        query.setParameter("data",id);
        Course course=query.getSingleResult();
        return course;
    }

    @Override
    @Transactional
    public void deleteCourseById(int id) {
        Course tempCourse=entityManager.find(Course.class,id);
        entityManager.remove(tempCourse);

    }

    @Override
    public Course findCourseAndStudentsByCourseId(int id) {

        TypedQuery<Course> query= entityManager.createQuery("select c from Course c "
                + "JOIN FETCH c.students "
                + "where c.id = :data",Course.class);
        query.setParameter("data",id);
        Course course=query.getSingleResult();

        return  course;
    }

    @Override
    public Student findStudentAndCourseByStudentId(int id) {
        TypedQuery<Student> query= entityManager.createQuery("select s from Student s "
                + "JOIN FETCH s.courses "
                + "where s.id = :data",Student.class);
        query.setParameter("data",id);
        Student student=query.getSingleResult();
        return student;
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteStudentById(int id) {
        Student tempStudent=entityManager.find(Student.class,id);
        entityManager.remove(tempStudent);
    }
}

