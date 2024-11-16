package org.lauren.services;

import org.lauren.entities.NailPolishEntities;
import org.lauren.repositories.NailPolishRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NailPolishService  {
    private NailPolishRepo nailPolishRepo;
    public NailPolishService(){}
    public List<NailPolishEntities> getnailPolish(){
        return nailPolishRepo.findAll();
    }

    public Optional<NailPolishEntities> getnailPolish(String id){
        return nailPolishRepo.findById(UUID.fromString(id));
    }

    public NailPolishEntities setnailPolish(NailPolishEntities nailPolish){
        nailPolish.setId(UUID.randomUUID().toString());
        nailPolishRepo.save(nailPolish);
        return nailPolish;
    }
    public NailPolishEntities updatenailPolish(String id, NailPolishEntities nailPolish){
        this.deletenailPolish(id);
        nailPolish.setId(id);
        nailPolishRepo.save(nailPolish);
        return this.setnailPolish(nailPolish);
    }

    public Boolean deletenailPolish(String id){
        try {
            nailPolishRepo.deleteById(UUID.fromString(id));
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
