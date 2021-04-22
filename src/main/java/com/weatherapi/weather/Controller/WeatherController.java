package com.weatherapi.weather.Controller;

import com.weatherapi.weather.Service.LiveWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @Autowired
    private final LiveWeatherService liveWeatherService;

    public WeatherController(LiveWeatherService liveWeatherService) {
        this.liveWeatherService = liveWeatherService;
    }

    @GetMapping("/")
    public String getCurrentWeather(Model model) {
        if (true) {
            model.addAttribute("currentWeather", liveWeatherService.getCurrentWeather("New York", "us"));
        } else {
            System.out.println("Printed Weather in Console ");
        }
        return "index";
    }

}
