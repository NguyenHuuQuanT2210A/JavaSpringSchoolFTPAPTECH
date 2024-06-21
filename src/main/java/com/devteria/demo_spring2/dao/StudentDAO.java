package com.devteria.demo_spring2.dao;

import com.devteria.demo_spring2.entity.ClassRoom;
import com.devteria.demo_spring2.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO implements IStudentDAO{
//    private final EntityManager entityManager;
//
//    @Autowired
//    public StudentDAO(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public Student getStudentById(int id) {
//        return this.entityManager.find(Student.class, id);
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        return this.entityManager.createQuery("from Student ", Student.class).getResultList();
//    }
//
//    @Override
//    @Transactional
//    public void saveStudent(Student student) {
//        this.entityManager.persist(student);
//    }
//
//    @Override
//    @Transactional
//    public void updateStudent(Student updatedStudent) {
//        Student existingStudent = entityManager.find(Student.class, updatedStudent.getId());
//
//        if (updatedStudent != null) {
//            updatedStudent.setFirstName(updatedStudent.getFirstName());
//            updatedStudent.setLastName(updatedStudent.getLastName());
//            updatedStudent.setEmail(updatedStudent.getEmail());
//            updatedStudent.setClassRoom(updatedStudent.getClassRoom());
//
//            entityManager.merge(existingStudent);
//        } else {
//            throw new RuntimeException("Student not found with id: " + updatedStudent.getId());
//        }
//    }
//
//    @Override
//    @Transactional
//    public void deleteStudent(int id) {
//        Student student = entityManager.find(Student.class, id);
//
//        if (student != null) {
//            entityManager.remove(student);
//        } else {
//            throw new RuntimeException("Student not found with id: " + id);
//        }
//    }
}
