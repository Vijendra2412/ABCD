package com.vjcoder.springBoot.demo.vjmycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "Hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello Wolrd";
    }

    //expose a new endpoint for "Workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Today is chest exercise Day";
    }

    // expose a new exndpoint for "diet"
    @GetMapping("/diet")
    public String getDailyDiet(){
        return "dies is good for health and Muscle";
    }

}
