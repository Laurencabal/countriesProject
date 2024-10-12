package org.lauren.Controllers;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1")
public class countriesController {
    @GetMapping("/countries")
    public String getCountries(String[] args){
        return "";
    }

    @GetMapping("/countries/{id}")
    public String getByIdCountries(@PathVariable String id){
        return "";
    }

    @GetMapping("/countries")
    public String createCountries(@PathVariable String id){
        return "";
    }


    @GetMapping("/countries/{id}")
    public String updateCountries(@PathVariable String id, @RequestBody Object country){
        return "";
    }

    @GetMapping("/countries/{id}")
    public String deleteCountry(@PathVariable String id){
        return "";
    }
}
