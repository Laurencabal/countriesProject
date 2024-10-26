package org.lauren.Controllers;

import org.lauren.entities.BlushEntities;
import org.lauren.services.BlushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/v1")
public class BlushController {
    @Autowired
    BlushService BlushService;
    @GetMapping("/blush")
    public List<BlushEntities> getblush(){
        return BlushService.getblush();
    }

    @GetMapping("/blush/{id}")
    public Optional<BlushEntities> getByIdblush (@PathVariable String id){
        return BlushService.getblush(id);
    }

    @PostMapping("/blush")
    public BlushEntities createblush(@RequestBody BlushEntities lip){
        return BlushService.setblush(lip);
    }

    @PutMapping("/blush/{id}")
    public BlushEntities updateblush(@PathVariable String id, @RequestBody BlushEntities lip){
        return BlushService.updateblush(id, lip);
    }

    @DeleteMapping("/blush/{id}")
    public Boolean deleteBlush(@PathVariable String id){
        return BlushService.deleteblush(id);
    }
}
