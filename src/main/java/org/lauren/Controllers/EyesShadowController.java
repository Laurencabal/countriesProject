package org.lauren.Controllers;

import org.lauren.services.EyesShadowService;
import org.lauren.entities.EyesShadowEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EyesShadowController {
    @Autowired
    EyesShadowService EyesShadowService;
    @GetMapping("/eyesShadow")
    public List<EyesShadowEntities> geteyesShadow(){
        return EyesShadowService.geteyesShadow();
    }

    @GetMapping("/eyesShadow/{id}")
    public Optional<EyesShadowEntities> getByIdeyesShadow (@PathVariable String id){
        return EyesShadowService.geteyesShadow(id);
    }

    @PostMapping("/eyesShadow")
    public EyesShadowEntities createeyesShadow(@RequestBody EyesShadowEntities lip){
        return EyesShadowService.seteyesShadow(lip);
    }

    @PutMapping("/eyesShadow/{id}")
    public EyesShadowEntities updateeyesShadow(@PathVariable String id, @RequestBody EyesShadowEntities lip){
        return EyesShadowService.updateeyesShadow(id, lip);
    }

    @DeleteMapping("/eyesShadow/{id}")
    public Boolean deleteEyesShadow(@PathVariable String id){
        return EyesShadowService.deleteeyesShadow(id);
    }
}
