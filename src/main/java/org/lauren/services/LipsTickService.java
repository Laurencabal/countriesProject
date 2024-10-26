package org.lauren.services;

import com.github.javafaker.Faker;
import org.lauren.entities.LipsTickEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class LipsTickService {
    private List<LipsTickEntities> lipsTick = new ArrayList<>();
    public LipsTickService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.lipsTick.add(new LipsTickEntities(
                    UUID.randomUUID().toString(),
                    faker.name().name(),
                    faker.code().asin(),
                    faker.code().ean13(),
                    faker.number().randomDigit(),
                    faker.commerce().price()
            ));
        }
    }
    public List<LipsTickEntities> getlipsTick(){
        return lipsTick;
    }

    public Optional<LipsTickEntities> getlipsTick(String id){
        return lipsTick.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public LipsTickEntities setlipsTick(LipsTickEntities lip){
        lip.setId(UUID.randomUUID().toString());
        this.lipsTick.add(lip);
        return lip;
    }
    public LipsTickEntities updatelipsTick(String id, LipsTickEntities lip){
        this.deletelipsTick(id);
        lip.setId(id);
        return this.setlipsTick(lip);
    }

    public Boolean deletelipsTick(String id){
        return lipsTick.removeIf(item -> item.getId().equals(id));
    }
}
