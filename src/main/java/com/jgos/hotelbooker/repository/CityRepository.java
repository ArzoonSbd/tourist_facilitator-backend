package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.data.City;
import com.jgos.hotelbooker.entity.user.UserDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    UserDb findByName(String name);
}
