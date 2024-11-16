package org.lauren.services;

import org.lauren.entities.LipsTickEntities;
import org.lauren.repositories.LipsTickRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class LipsTickService {

    private LipsTickRepo lipsTickRepo;
    public LipsTickService(){}

    public List<LipsTickEntities> getlipsTick(){
        return lipsTickRepo.findAll();
    }

    public Optional<LipsTickEntities> getlipsTick(String id){
        return lipsTickRepo.findById(UUID.fromString(id));
    }

    public LipsTickEntities setlipsTick(LipsTickEntities lip){
        lip.setId(UUID.randomUUID().toString());
        lipsTickRepo.save(lip);
        return lip;
    }
    public LipsTickEntities updatelipsTick(String id, LipsTickEntities lip){
        this.deletelipsTick(id);
        lip.setId(id);
        lipsTickRepo.save(lip);
        return this.setlipsTick(lip);
    }

    public Boolean deletelipsTick(String id){
        try {
            lipsTickRepo.deleteById(UUID.fromString(id));
            return true;
        } catch(Exception e){
            return false;
        }

    }
}
