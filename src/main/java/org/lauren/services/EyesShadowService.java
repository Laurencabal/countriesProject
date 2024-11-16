package org.lauren.services;

import org.lauren.entities.BlushEntities;
import org.lauren.repositories.EyesShadowRepo;
import org.lauren.entities.EyesShadowEntities;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EyesShadowService {
    private EyesShadowRepo eyesShadowRepo;
    public EyesShadowService(){}

    public List<EyesShadowEntities> geteyesShadow(){
        return eyesShadowRepo.findAll();
    }

    public Optional<EyesShadowEntities> geteyesShadow(String id){
        return eyesShadowRepo.findById(UUID.fromString(id));
    }

    public EyesShadowEntities seteyesShadow(EyesShadowEntities EyesShadows){
        EyesShadows.setId(UUID.randomUUID().toString());
        eyesShadowRepo.save(EyesShadows);
        return EyesShadows;
    }

    public EyesShadowEntities updateeyesShadow(String id, EyesShadowEntities EyesShadows){
        this.deleteeyesShadow(id);
        EyesShadows.setId(id);
        eyesShadowRepo.save(EyesShadows);
        return this.seteyesShadow(EyesShadows);
    }

    public Boolean deleteeyesShadow(String id){
        try {
            eyesShadowRepo.deleteById(UUID.fromString(id));
            return true;
        } catch(Exception e){
            return false;
        }

    }
}
