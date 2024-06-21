package com.devteria.demo_spring2.repository;

import com.devteria.demo_spring2.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom, String> {
}
