package com.devteria.demo_spring2.service;

import com.devteria.demo_spring2.entity.ClassRoom;
import com.devteria.demo_spring2.entity.Student;
import com.devteria.demo_spring2.repository.ClassRoomRepository;
import com.devteria.demo_spring2.repository.StudentRepository;
import com.devteria.demo_spring2.request.dto.StudentCreationRequest;
import com.devteria.demo_spring2.request.dto.StudentUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ClassRoomService classRoomService;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentUpdateRequest getStudentById(int id) {
        var student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        StudentUpdateRequest studentUpdateRequest = new StudentUpdateRequest();
        studentUpdateRequest.setId(student.getId());
        studentUpdateRequest.setEmail(student.getEmail());
        studentUpdateRequest.setFirstName(student.getFirstName());
        studentUpdateRequest.setLastName(student.getLastName());
        studentUpdateRequest.setClassRoomId(student.getClassRoom().getId_class());
        return studentUpdateRequest;
    }

    public Student addStudent(StudentCreationRequest request) {
        ClassRoom classRoom = classRoomService.getClassRoomById(request.getClassRoomId().toString());
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setClassRoom(classRoom);

        return studentRepository.save(student);
    }

    public Student updateStudent(Integer id, StudentCreationRequest request) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

        ClassRoom classRoom = classRoomService.getClassRoomById(request.getClassRoomId().toString());

        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setClassRoom(classRoom);

        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

}
