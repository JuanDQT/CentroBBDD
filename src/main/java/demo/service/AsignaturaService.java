package demo.service;

import demo.model.Alumnos;
import demo.model.Asignatura;
import demo.model.Especialidad;
import demo.resource.AlumnosRepository;
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
    private AlumnosRepository alumnosRepository;

    public void testAsignatura(){
        /*CREACION DE ASIGNATURAS*/
        Asignatura bases = new Asignatura();
        bases.setNombre("Bases de datos");
        bases.setDuracion(300L);
        bases.setEspecialidad(Especialidad.DAM);
        asignaturaRepository.save(bases);

        Asignatura lenguajes = new Asignatura();
        lenguajes.setNombre("Lenguajes de Marcas");
        lenguajes.setDuracion(250L);
        lenguajes.setEspecialidad(Especialidad.DAM);
        asignaturaRepository.save(lenguajes);

        Asignatura asix = new Asignatura();
        asix.setNombre("Colocacion de routers");
        asix.setDuracion(100L);
        asix.setEspecialidad(Especialidad.ASIX);
        asignaturaRepository.save(asix);

        /*CREACION DE ALUMNOS CON SU RESPECTIVA FORMACION*/
        Alumnos a1 = new Alumnos();
        a1.setNombre("Juan");
        a1.setApellido("Mendez");
        a1.setEspecialidad(Especialidad.DAM);
        alumnosRepository.save(a1);

        Alumnos a2 = new Alumnos();
        a2.setNombre("Marc");
        a2.setApellido("Sanahuja");
        a2.setEspecialidad(Especialidad.DAM);
        alumnosRepository.save(a2);

        Alumnos a3 = new Alumnos();
        a3.setNombre("Andres");
        a3.setApellido("Romero");
        a3.setEspecialidad(Especialidad.DAM);
        alumnosRepository.save(a3);

        Alumnos a4 = new Alumnos();
        a4.setNombre("Gudiño");
        a4.setEspecialidad(Especialidad.ASIX);
        alumnosRepository.save(a4);
    }
}
