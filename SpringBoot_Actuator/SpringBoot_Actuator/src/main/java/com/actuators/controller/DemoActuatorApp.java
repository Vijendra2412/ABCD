package com.actuators.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoActuatorApp {
    //inject properties for: for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${Team.name}")
    private String TeamName;

//    expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")

    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + TeamName ;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run atleast 5k!";
    }

    //expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyfortune(){
        return "Today is your lucky day";
    }
}
