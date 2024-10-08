package ru.netology.controller;

import ru.netology.entity.Persons;
import ru.netology.service.ServiceApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ControllerApp {

    private final ServiceApp serviceApp;

    public ControllerApp(ServiceApp serviceApp){
       this.serviceApp = serviceApp;
   }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Persons> getCity(@RequestParam("city") String city) {
        return serviceApp.getCityOfLiving(city);
    }
}