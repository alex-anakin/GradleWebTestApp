package org.itevents.controller;

import org.itevents.model.Event;
import org.itevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventRestController {

    @Autowired
    EventService eventService;

    @RequestMapping(value = "/events")
    public List<Event> getAllEvents()
    {

        return eventService.getAllEvents();
    }

    @RequestMapping(value = "/events/{id}")
    public ResponseEntity<Event> getEvent (@PathVariable("id") Long id) {
        Event event = eventService.getEvent(id);
        if (event == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Event>(event, HttpStatus.OK);
    }
}
