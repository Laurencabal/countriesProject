package org.lauren.services;

import com.github.javafaker.Faker;
import org.lauren.entities.NailPolishEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NailPolishService  {
    private List<NailPolishEntities> nailPolish = new ArrayList<>();
    public NailPolishService(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            this.nailPolish.add(new NailPolishEntities(
                    UUID.randomUUID().toString(),
                    faker.name().name(),
                    faker.code().asin(),
                    faker.code().ean13(),
                    faker.number().randomDigit(),
                    faker.commerce().price()
            ));
        }
    }
    public List<NailPolishEntities> getnailPolish(){
        return nailPolish;
    }

    public Optional<NailPolishEntities> getnailPolish(String id){
        return nailPolish.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public NailPolishEntities setnailPolish(NailPolishEntities nailPolish){
        nailPolish.setId(UUID.randomUUID().toString());
        this.nailPolish.add(nailPolish);
        return nailPolish;
    }
    public NailPolishEntities updatenailPolish(String id, NailPolishEntities nailPolish){
        this.deletenailPolish(id);
        nailPolish.setId(id);
        return this.setnailPolish(nailPolish);
    }

    public Boolean deletenailPolish(String id){
        return nailPolish.removeIf(item -> item.getId().equals(id));
    }
}
