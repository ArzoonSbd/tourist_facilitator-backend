package com.jgos.hotelbooker.repository;

import com.jgos.hotelbooker.entity.hotel.Feedback;
import com.jgos.hotelbooker.entity.hotel.data.City;
import com.jgos.hotelbooker.entity.user.UserDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
