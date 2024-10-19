package org.lauren.services;

import com.github.javafaker.Faker;
import org.lauren.entities.EsmaltesEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EsmaltesService {
    private List<EsmaltesEntities> esmaltes = new ArrayList<>();
    public EsmaltesService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.esmaltes.add(new EsmaltesEntities(
                    UUID.randomUUID().toString(),
                    faker.name().name(),
                    faker.code().asin(),
                    faker.code().ean13(),
                    faker.number().randomDigit(),
                    faker.commerce().price()
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

    public EsmaltesEntities setEsmaltes(EsmaltesEntities esmalte){
        esmalte.setId(UUID.randomUUID().toString());
        this.esmaltes.add(esmalte);
        return esmalte;
    }
    public EsmaltesEntities updateEsmaltes(String id, EsmaltesEntities esmalte){
        this.deleteEsmaltes(id);
        esmalte.setId(id);
        return this.setEsmaltes(esmalte);
    }

    public Boolean deleteEsmaltes(String id){
        return esmaltes.removeIf(item -> item.getId().equals(id));
    }
}
