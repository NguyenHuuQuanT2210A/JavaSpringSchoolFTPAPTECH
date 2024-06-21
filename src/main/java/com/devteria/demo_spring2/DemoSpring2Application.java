package com.devteria.demo_spring2;

import com.devteria.demo_spring2.dao.ClassRoomDAO;
import com.devteria.demo_spring2.entity.ClassRoom;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpring2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring2Application.class, args);
    }
//    @Bean
//    public CommandLineRunner commandLineRunner(ClassRoomDAO classRoomDAO) {
//        return args -> {
//            System.out.println("Start....");
//            getClassById(classRoomDAO);
//            addNewClass(classRoomDAO);
//            updatedClass(classRoomDAO);
//            deleteClassById(classRoomDAO);
//        };
//    }
//
//    private static void addNewClass(ClassRoomDAO classRoomDAO) {
//        ClassRoom classRoom = new ClassRoom();
//        classRoom.setClass_name("T2210A");
//        classRoom.setNumber_member(20);
//        classRoomDAO.saveClassRoom(classRoom);
//    }
//
//    private static void getClassById(ClassRoomDAO classRoomDAO) {
//        ClassRoom classRoom = classRoomDAO.getClassRoomById(1L);
//        System.out.println(classRoom.toString());
//    }
//
//    private static void updatedClass(ClassRoomDAO classRoomDAO) {
//        ClassRoom classRoom = classRoomDAO.getClassRoomById(1L);
//        classRoom.setClass_name("T2210A");
//        classRoom.setNumber_member(20);
//        classRoomDAO.updateClassRoom(classRoom);
//    }
//
//    private static void deleteClassById(ClassRoomDAO classRoomDAO) {
//        classRoomDAO.deleteClassRoom(14L);
//    }

}
