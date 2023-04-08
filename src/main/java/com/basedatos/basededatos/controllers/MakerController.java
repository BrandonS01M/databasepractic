package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MakerModel;
import com.basedatos.basededatos.services.MakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/maker")
public class MakerController {
    @Autowired
    MakerService makerService;

    @GetMapping("/getAll")
    List<MakerModel> getAll(){
        return makerService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    MakerModel getById(@PathVariable("id") long id ){
        return makerService.get(id);
    }

    @PostMapping(value = "/create")
    MakerModel create(@RequestBody MakerModel makerModel){
        return makerService.register(makerModel);
    }

    @PutMapping(value = "/update/{id}")
    MakerModel updateById(@RequestBody MakerModel makerModel){
        return makerService.update(makerModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteById(@PathVariable("id") long id){
        makerService.delete(id);
    }
}
