package demo.controllers;

import demo.model.Asignatura;
import demo.resource.AsignaturaRepository;
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
@RequestMapping("/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Asignatura save(@RequestBody Asignatura asignatura){
        return asignaturaRepository.save(asignatura);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Asignatura> findAll(){
        List<Asignatura> asignaturas = new ArrayList<>();
        Iterator<Asignatura> iterator = asignaturaRepository.findAll().iterator();

        while(iterator.hasNext()){
            asignaturas.add(iterator.next());
        }
        return asignaturas;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Asignatura getById(@PathVariable Long id){
        Asignatura asignatura = asignaturaRepository.findOne(id);
        return asignatura;
    }
}
