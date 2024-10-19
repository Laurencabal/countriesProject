package org.lauren.Controllers;

import org.lauren.entities.EsmaltesEntities;
import org.lauren.services.EsmaltesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EsmaltesController {
    @Autowired
    EsmaltesService esmaltesService;
    @GetMapping("/esmaltes")
    public List<EsmaltesEntities> getEsmaltes(){
        return esmaltesService.getEsmaltes();
    }

    @GetMapping("/esmaltes/{id}")
    public Optional<EsmaltesEntities> getByIdEsmaltes (@PathVariable String id){
        return esmaltesService.getEsmaltes(id);
    }

    @PostMapping("/esmaltes")
    public EsmaltesEntities createEsmaltes(@RequestBody EsmaltesEntities esmalte){
        return esmaltesService.setEsmaltes(esmalte);
    }


    @PutMapping("/esmaltes/{id}")
    public EsmaltesEntities updateEsmaltes(@PathVariable String id, @RequestBody EsmaltesEntities esmalte){
        return esmaltesService.updateEsmaltes(id, esmalte);
    }

    @DeleteMapping("/esmaltes/{id}")
    public Boolean deleteEsmalte(@PathVariable String id){
        return esmaltesService.deleteEsmaltes(id);
    }
}
