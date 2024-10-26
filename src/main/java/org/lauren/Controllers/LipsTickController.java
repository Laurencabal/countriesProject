package org.lauren.Controllers;

import org.lauren.entities.LipsTickEntities;
import org.lauren.services.LipsTickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class LipsTickController {
    @Autowired
    LipsTickService LipsTickService;
    @GetMapping("/lipsTick")
    public List<LipsTickEntities> getlipsTick(){
        return LipsTickService.getlipsTick();
    }

    @GetMapping("/lipsTick/{id}")
    public Optional<LipsTickEntities> getByIdlipsTick (@PathVariable String id){
        return LipsTickService.getlipsTick(id);
    }

    @PostMapping("/lipsTick")
    public LipsTickEntities createlipsTick(@RequestBody LipsTickEntities lip){
        return LipsTickService.setlipsTick(lip);
    }

    @PutMapping("/lipsTick/{id}")
    public LipsTickEntities updatelipsTick(@PathVariable String id, @RequestBody LipsTickEntities lip){
        return LipsTickService.updatelipsTick(id, lip);
    }

    @DeleteMapping("/lipsTick/{id}")
    public Boolean deleteLip(@PathVariable String id){
        return LipsTickService.deletelipsTick(id);
    }
}
