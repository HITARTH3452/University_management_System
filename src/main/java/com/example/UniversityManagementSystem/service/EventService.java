package com.example.UniversityManagementSystem.service;

import com.example.UniversityManagementSystem.models.Event;
import com.example.UniversityManagementSystem.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private IEventRepo eventRepo;

    public List<Event> getEventByDate(String date) {
        List<Event> byDate = eventRepo.findByDate(date);
        return byDate;
    }

    public String addEvent(Iterable<Event> eventList) {
        eventRepo.saveAll(eventList);
        return "added";
    }

    public String updateEventLocation(Integer id ,String location) {
        Event event = eventRepo.findById(id).get();
        event.setLocationOfEvent(location);
        return "updated";
    }

    public String deleteEventById(Integer id) {
        eventRepo.deleteById(id);
        return "deleted";
    }
}
