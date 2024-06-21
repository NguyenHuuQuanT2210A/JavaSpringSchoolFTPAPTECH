package com.devteria.demo_spring2.service;

import com.devteria.demo_spring2.entity.ClassRoom;
import com.devteria.demo_spring2.repository.ClassRoomRepository;
import com.devteria.demo_spring2.request.dto.ClassRoomCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;

    public List<ClassRoom> getAllClassRooms() {
        return classRoomRepository.findAll();
    }

    public ClassRoom getClassRoomById(String id) {
        return classRoomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("classRoom not found"));
    }

    public ClassRoom saveClassRoom(ClassRoomCreationRequest request) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClass_name(request.getClass_name());
        classRoom.setNumber_member(request.getNumber_member());
        return classRoomRepository.save(classRoom);
    }

    public ClassRoom updateClassRoom(String id, ClassRoomCreationRequest request) {
        ClassRoom classRoom = getClassRoomById(id);
        classRoom.setClass_name(request.getClass_name());
        classRoom.setNumber_member(request.getNumber_member());
        return classRoomRepository.save(classRoom);
    }

    public void deleteClassRoom(String id) {
        classRoomRepository.deleteById(id);
    }

}
