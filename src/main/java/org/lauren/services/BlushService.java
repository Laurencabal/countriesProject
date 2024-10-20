package org.lauren.services;

import com.github.javafaker.Faker;
import org.lauren.entities.BlushEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class BlushService {
    private List<BlushEntities> blush = new ArrayList<>();
    public BlushService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.blush.add(new BlushEntities(
                    UUID.randomUUID().toString(),
                    faker.name().name(),
                    faker.code().asin(),
                    faker.code().ean13(),
                    faker.number().randomDigit(),
                    faker.commerce().price()
            ));
        }
    }
    public List<BlushEntities> getblush(){
        return blush;
    }

    public Optional<BlushEntities> getblush(String id){
        return blush.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public BlushEntities setblush(BlushEntities lip){
        lip.setId(UUID.randomUUID().toString());
        this.blush.add(lip);
        return lip;
    }
    public BlushEntities updateblush(String id, BlushEntities lip){
        this.deleteblush(id);
        lip.setId(id);
        return this.setblush(lip);
    }

    public Boolean deleteblush(String id){
        return blush.removeIf(item -> item.getId().equals(id));
    }
}
