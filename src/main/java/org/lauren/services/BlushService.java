package org.lauren.services;

import org.lauren.entities.BlushEntities;
import org.lauren.repositories.BlushRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class BlushService {
    private BlushRepo blushRepo;
    public BlushService(){
    }
    public List<BlushEntities> getblush(){return blushRepo.findAll();}

    public Optional<BlushEntities> getblush(String id) {
        return blushRepo.findById(UUID.fromString(id));
    }

    public BlushEntities setblush(BlushEntities Blush){
        Blush.setId(UUID.randomUUID().toString());
        blushRepo.save(Blush);
        return Blush;
    }
    public BlushEntities updateblush(String id, BlushEntities Blush){
        this.deleteblush(id);
        blushRepo.save(id);
        return this.setblush(Blush);
    }

    public Boolean deleteblush(String id){
        return blush.removeIf(item -> item.getId().equals(id));
    }
}
