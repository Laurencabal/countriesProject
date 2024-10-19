package org.lauren.services;

import com.github.javafaker.Faker;
import org.lauren.entities.EsmaltesEntities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EsmaltesService {
    private List<EsmaltesEntities> esmaltes = new ArrayList<>();
    public EsmaltesService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.esmaltes.add(new EsmaltesEntities(
                    UUID.randomUUID().toString(),
                    faker.name().toString(),
                    faker.code().toString(),
                    faker.code().toString()
            ));
        }
    }
    public List<EsmaltesEntities> getEsmaltes(){
        return esmaltes;
    }

    public Optional<EsmaltesEntities> getEsmaltes(String id){
        return esmaltes.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }


    public Boolean setEsmaltes(EsmaltesEntities esmalte){
        return this.esmaltes.add(esmalte);
    }
    public Boolean updateEsmaltes(String id, EsmaltesEntities esmalte){
        this.deleteEsmaltes(id);
        esmalte.setId(id);
        return this.setEsmaltes(esmalte);
    }

    public Boolean deleteEsmaltes(String id){
        return esmaltes.removeIf(item -> item.getId().equals(id));
    }
}
