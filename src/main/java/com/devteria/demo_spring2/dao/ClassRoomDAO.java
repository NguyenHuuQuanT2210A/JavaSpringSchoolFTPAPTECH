package com.devteria.demo_spring2.dao;

import com.devteria.demo_spring2.entity.ClassRoom;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassRoomDAO implements IClassRoomDAO{
//    private final EntityManager entityManager;
//    @Autowired
//    public ClassRoomDAO(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    @Transactional
//    public void saveClassRoom(ClassRoom classRoom) {
//        this.entityManager.persist(classRoom);
//    }
//
//    @Override
//    public ClassRoom getClassRoomById(Long id) {
//        return this.entityManager.find(ClassRoom.class, id);
//    }
//
//    @Override
//    public List<ClassRoom> getAllClassRooms() {
//        return this.entityManager.createQuery("from ClassRoom", ClassRoom.class).getResultList();
//    }
//
//    @Override
//    @Transactional
//    public void updateClassRoom(ClassRoom updatedClassRoom) {
//        ClassRoom existingClassRoom = entityManager.find(ClassRoom.class, updatedClassRoom.getId_class());
//
//        if (existingClassRoom != null) {
//            existingClassRoom.setClass_name(updatedClassRoom.getClass_name());
//            existingClassRoom.setNumber_member(updatedClassRoom.getNumber_member());
//
//            entityManager.merge(existingClassRoom);
//        } else {
//            throw new RuntimeException("ClassRoom not found with id: " + updatedClassRoom.getId_class());
//        }
//    }
//
//    @Override
//    @Transactional
//    public void deleteClassRoom(Long id) {
//        ClassRoom classRoom = entityManager.find(ClassRoom.class, id);
//
//        if (classRoom != null) {
//            entityManager.remove(classRoom);
//        } else {
//            throw new RuntimeException("ClassRoom not found with id: " + id);
//        }
//    }

}
