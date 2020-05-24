package com.RydoTask.CreateApi.RudoTaskApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RydoTask.CreateApi.RudoTaskApi.entity.ClassRoom;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom, Integer> {

}
