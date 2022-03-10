package com.PIDEV.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PIDEV.demo.model.Event;

@Repository
public interface eventRepo extends CrudRepository< Event , Integer> {
}
