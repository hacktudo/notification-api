package com.hacktudo.notificationapi.controller;

import com.hacktudo.notificationapi.dto.OcurrencyDTO;
import com.hacktudo.notificationapi.model.Event;
import com.hacktudo.notificationapi.model.Ocurrency;
import com.hacktudo.notificationapi.service.HomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/v1/home","/home"})
public class HomeController {

    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/events")
    public ResponseEntity<Iterable<Event>> getEvents() {
        return ResponseEntity.ok(homeService.getAllEvents());
    }

    @PostMapping("/ocurrencies")
    public ResponseEntity<Ocurrency> getEvents(@RequestBody OcurrencyDTO ocurrency) {
        return ResponseEntity.ok(homeService.saveOcurrency(ocurrency));
    }
}
