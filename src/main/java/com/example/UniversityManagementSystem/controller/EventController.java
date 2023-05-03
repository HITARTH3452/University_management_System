package com.example.UniversityManagementSystem.controller;

import com.example.UniversityManagementSystem.models.Event;
import com.example.UniversityManagementSystem.service.EventService;
import com.example.UniversityManagementSystem.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping(value = "getEventsByDate/{date}")
    public List<Event> getEvent(@PathVariable String date){
        return eventService.getEventByDate(date);
    }

    @PostMapping(value = "addEvent")
    public String addEvent(@Valid @RequestBody Iterable<Event> eventList){
        return eventService.addEvent(eventList);
    }

    @PutMapping(value = "updateEvent/{id}/{location}")
    public String updateEventByLocation(@PathVariable Integer id, @PathVariable String location){
        return eventService.updateEventLocation(id, location);
    }

    @DeleteMapping(value = "deleteEvent/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }
}
