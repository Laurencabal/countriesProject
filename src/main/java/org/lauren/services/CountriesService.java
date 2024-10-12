package org.lauren.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import org.lauren.entities.CountriesEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CountriesService {
    private List<CountriesEntities> countries = new ArrayList<>();
    public CountriesService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.countries.add(new CountriesEntities(
                    faker.idNumber().toString(),
                    faker.name().toString(),
                    faker.name().toString(),
                    faker.name().toString()
            ));
        }
    }
    public List<CountriesEntities> getCountries(){
        return countries;
    }

    public Optional<CountriesEntities> getCountries(String id){
        return countries.stream()
                .filter(item -> item.getId().equals(id))
        .findFirst();
    }

}
