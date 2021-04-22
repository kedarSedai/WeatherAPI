package com.weatherapi.weather.Controller;

import com.weatherapi.weather.Entity.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class WeatherController {

    @GetMapping("/")
    public String getCurrentWeather(Model model) {
        Weather weather = new Weather("Clear", BigDecimal.ONE, BigDecimal.TEN, BigDecimal.ZERO);
        model.addAttribute("weather", weather);
        return "index";
    }

}
