package demo.controllers;

import demo.model.Alumno;
import demo.resource.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by poo2 on 29/06/2015..
 */
@RestController
@RequestMapping("/alumnos")
public class AlumnosController {

    //INYECCION DEL REPOSITORIO
    @Autowired
    private AlumnoRepository alumnoRepository;

    //CREAR ALUMNO, single
    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    //OBTENER ALUMNOS, GET, lista
    @RequestMapping(method= RequestMethod.GET)
    public List<Alumno> findAll() {
        List<Alumno> alumnos = new ArrayList<>();
        Iterator<Alumno> iterator = alumnoRepository.findAll().iterator();

        while (iterator.hasNext()) {
            alumnos.add(iterator.next());
        }

        return alumnos;
    }

    //CONSEGUIR UN ALUMNO A TRAVES DE SU ID
    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public Alumno getById(@PathVariable Long id) {
        Alumno alumno = alumnoRepository.findOne(id);
/*
        if (alumno == null)
            throw new DeveloperException(id);
*/
        return alumno;
    }

    /*
    @RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
         public Developer deleteById(@PathVariable Long id) {
        Developer developer = developerRepository.findOne(id);

        if (developer == null)
            throw new DeveloperException(id);

        developerRepository.delete(id);
        return developer;
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.PUT)
    public Developer updateById(@PathVariable Long id, @RequestBody Developer newDeveloper) {
        Developer developer = developerRepository.findOne(id);

        if (developer == null)
            throw new DeveloperException(id);

        newDeveloper = developerRepository.save(newDeveloper);
        return newDeveloper;

    }*/
}