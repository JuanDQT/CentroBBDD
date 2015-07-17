package demo.controllers;

import demo.model.Profesor;
import demo.resource.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Juan Daniel on 05/07/2015.
 */
@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorRepository profesorRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor save(@RequestBody Profesor profesor){
        return profesorRepository.save(profesor);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Profesor> findall(){
        List<Profesor> profesores = new ArrayList<>();
        Iterator<Profesor> iterator = profesorRepository.findAll().iterator();

        while (iterator.hasNext()){
            profesores.add(iterator.next());
        }
        return profesores;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Profesor getById(@PathVariable Long id){
        Profesor profesor = profesorRepository.findOne(id);
        return profesor;
    }
}
