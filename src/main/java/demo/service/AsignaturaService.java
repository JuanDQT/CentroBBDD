package demo.service;
/*
import demo.model.Alumno;
import demo.model.Asignatura;
import demo.model.Especialidad;*/

import demo.model.Alumno;
import demo.model.Asignatura;
import demo.resource.AlumnoRepository;
import demo.resource.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Juan Daniel on 26/06/2015.
 */


@Service
public class AsignaturaService {
    @Autowired
    private AsignaturaRepository asignaturaRepository;
    @Autowired
    private AlumnoRepository alumnoRepository;

    public void testAsignatura(){
        //CREACION DE ASIGNATURAS
        Asignatura bases = new Asignatura();
        bases.setNombre("Bases de datos");
        bases.setDuracion(300L);
        asignaturaRepository.save(bases);

        Asignatura lenguajes = new Asignatura();
        lenguajes.setNombre("Lenguajes de Marcas");
        lenguajes.setDuracion(250L);
        asignaturaRepository.save(lenguajes);

        Asignatura asix = new Asignatura();
        asix.setNombre("Colocacion de routers");
        asix.setDuracion(100L);
        asignaturaRepository.save(asix);

        //CREACION DE ALUMNOS CON SU RESPECTIVA FORMACION
        Alumno a1 = new Alumno();
        a1.setNombre("Juan");
        a1.setApellido("Mendez");
        alumnoRepository.save(a1);

        Alumno a2 = new Alumno();
        a2.setNombre("Marc");
        a2.setApellido("Sanahuja");
        alumnoRepository.save(a2);

        Alumno a3 = new Alumno();
        a3.setNombre("Andres");
        a3.setApellido("Romero");
        alumnoRepository.save(a3);

        Alumno a4 = new Alumno();
        a4.setNombre("Gudiño");
        a4.setApellido("Desconocido");
        alumnoRepository.save(a4);
    }
}
