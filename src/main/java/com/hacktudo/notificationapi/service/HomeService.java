package com.hacktudo.notificationapi.service;

import com.hacktudo.notificationapi.model.Event;
import com.hacktudo.notificationapi.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private EventRepository eventRepository;

    public HomeService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Iterable<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
