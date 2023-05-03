package com.example.UniversityManagementSystem.repository;

import com.example.UniversityManagementSystem.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {

    public List<Event> findByDate(String date);

}
