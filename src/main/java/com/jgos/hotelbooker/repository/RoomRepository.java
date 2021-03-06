package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.room.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findByIdNotIn(Collection<Long> room);

    Room findById(long id);
}
