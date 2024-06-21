package com.devteria.demo_spring2.controller;

import com.devteria.demo_spring2.entity.ClassRoom;
import com.devteria.demo_spring2.request.dto.ClassRoomCreationRequest;
import com.devteria.demo_spring2.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classroom")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping
    String getAllClassRoom(Model model){
        List<ClassRoom> classRooms = classRoomService.getAllClassRooms();
        model.addAttribute("classRooms", classRooms);
        return "classroom/index";
    }

    @GetMapping("/create")
    String addClassRoom(Model model){
        model.addAttribute("classRoom", new ClassRoomCreationRequest());
        return "classroom/add";
    }

    @PostMapping("/create")
    String addClassRoom(@ModelAttribute ClassRoomCreationRequest request){
        classRoomService.saveClassRoom(request);
        return "redirect:/classroom";
    }

    @GetMapping("/edit/{id}")
    String editClassRoom(@PathVariable String id,Model model){
        ClassRoom classRoom = classRoomService.getClassRoomById(id);
        model.addAttribute("classRoom", classRoom);
        return "classroom/edit";
    }

    @PostMapping("/edit/{id}")
    String updatedClassRoom(@PathVariable String id,@ModelAttribute ClassRoomCreationRequest request){
        classRoomService.updateClassRoom(id, request);
        return "redirect:/classroom";
    }

    @GetMapping("/delete/{id}")
    String deleteClassRoom(@PathVariable String id){
        classRoomService.deleteClassRoom(id);
        return "redirect:/classroom";
    }

}
