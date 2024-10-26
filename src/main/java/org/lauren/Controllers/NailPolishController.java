package org.lauren.Controllers;

import org.lauren.entities.NailPolishEntities;
import org.lauren.services.NailPolishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class NailPolishController {
    @Autowired
    NailPolishService NailPolishService;
    @GetMapping("/nailPolish")
    public List<NailPolishEntities> getnailPolish(){
        return NailPolishService.getnailPolish();
    }

    @GetMapping("/nailPolish/{id}")
    public Optional<NailPolishEntities> getByIdnailPolish (@PathVariable String id){
        return NailPolishService.getnailPolish(id);
    }

    @PostMapping("/nailPolish")
    public NailPolishEntities createnailPolish(@RequestBody NailPolishEntities nailPolish){
        return NailPolishService.setnailPolish(nailPolish);
    }

    @PutMapping("/nailPolish/{id}")
    public NailPolishEntities updatenailPolish(@PathVariable String id, @RequestBody NailPolishEntities nailPolish){
        return NailPolishService.updatenailPolish(id, nailPolish);
    }

    @DeleteMapping("/nailPolish/{id}")
    public Boolean deleteNailPolish(@PathVariable String id){
        return NailPolishService.deletenailPolish(id);
    }
}
