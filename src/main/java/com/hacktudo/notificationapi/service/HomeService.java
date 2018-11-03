package com.hacktudo.notificationapi.service;

import com.hacktudo.notificationapi.dto.OcurrencyDTO;
import com.hacktudo.notificationapi.model.Event;
import com.hacktudo.notificationapi.model.Ocurrency;
import com.hacktudo.notificationapi.model.Person;
import com.hacktudo.notificationapi.repository.EventRepository;
import com.hacktudo.notificationapi.repository.OcurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HomeService {

    private EventRepository eventRepository;
    private OcurrencyRepository ocurrencyRepository;

    public HomeService(EventRepository eventRepository, OcurrencyRepository ocurrencyRepository) {
        this.eventRepository = eventRepository;
        this.ocurrencyRepository = ocurrencyRepository;
    }

    public Iterable<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Ocurrency saveOcurrency(OcurrencyDTO ocurrencyDTO) {

        Person person = new Person();
        person.setId(ocurrencyDTO.getPersonId());

        Event event = new Event();
        event.setId(ocurrencyDTO.getEventId());

        Ocurrency ocurrency = new Ocurrency(ocurrencyDTO.getId(), person, event, ocurrencyDTO.getLatitude(),
                ocurrencyDTO.getLongitude(), ocurrencyDTO.getStatus(), new Date(), ocurrencyDTO.getData());

        return ocurrencyRepository.save(ocurrency);
    }
}
