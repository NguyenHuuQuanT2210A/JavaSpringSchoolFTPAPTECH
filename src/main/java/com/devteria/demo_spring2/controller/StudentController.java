package com.devteria.demo_spring2.controller;

import com.devteria.demo_spring2.request.dto.StudentCreationRequest;
import com.devteria.demo_spring2.service.ClassRoomService;
import com.devteria.demo_spring2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students/index";
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "students/detail";
    }

    @GetMapping("/create")
    public String createStudent(Model model) {
        model.addAttribute("student", new StudentCreationRequest());
        model.addAttribute("classrooms", classRoomService.getAllClassRooms());
        return "students/add";
    }

    @PostMapping("/create")
    public String postStudent(@ModelAttribute("student") StudentCreationRequest request) {
        studentService.addStudent(request);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("classrooms", classRoomService.getAllClassRooms());
        return "students/edit";
    }

    @PostMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, @ModelAttribute StudentCreationRequest request) {
        studentService.updateStudent(id, request);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
            studentService.deleteStudent(id);

        return "redirect:/students";
    }
}
