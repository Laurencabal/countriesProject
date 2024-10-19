package org.lauren.Controllers;

import org.lauren.entities.CountriesEntities;
import org.lauren.services.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class countriesController {
    @Autowired
    CountriesService countriesService;
    @GetMapping("/countries")
    public List<CountriesEntities> getCountries(){
        return countriesService.getCountries();
    }

    @GetMapping("/countries/{id}")
    public Optional<CountriesEntities> getByIdCountries (@PathVariable String id){
        return countriesService.getCountries(id);
    }

    @PostMapping("/countries")
    public Boolean createCountries(@RequestBody CountriesEntities country){
        return countriesService.setCountries(country);
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
