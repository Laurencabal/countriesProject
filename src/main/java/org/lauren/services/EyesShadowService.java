package org.lauren.services;

import com.github.javafaker.Faker;
import org.lauren.entities.EyesShadowEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EyesShadowService {
    private List<EyesShadowEntities> eyesShadow = new ArrayList<>();
    public EyesShadowService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.eyesShadow.add(new EyesShadowEntities(
                    UUID.randomUUID().toString(),
                    faker.name().name(),
                    faker.code().asin(),
                    faker.code().ean13(),
                    faker.number().randomDigit(),
                    faker.commerce().price()
            ));
        }
    }
    public List<EyesShadowEntities> geteyesShadow(){
        return eyesShadow;
    }

    public Optional<EyesShadowEntities> geteyesShadow(String id){
        return eyesShadow.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public EyesShadowEntities seteyesShadow(EyesShadowEntities lip){
        lip.setId(UUID.randomUUID().toString());
        this.eyesShadow.add(lip);
        return lip;
    }
    public EyesShadowEntities updateeyesShadow(String id, EyesShadowEntities lip){
        this.deleteeyesShadow(id);
        lip.setId(id);
        return this.seteyesShadow(lip);
    }

    public Boolean deleteeyesShadow(String id){
        return eyesShadow.removeIf(item -> item.getId().equals(id));
    }

}
