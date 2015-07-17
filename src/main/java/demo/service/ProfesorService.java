package demo.service;

import demo.model.Asignatura;
import demo.model.Especialidad;
import demo.model.Profesor;
import demo.resource.AsignaturaRepository;
import demo.resource.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Juan Daniel on 27/06/2015.
 */



@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;
    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public void testProfesor(){

        Asignatura pue = new Asignatura();
        pue.setNombre("CURSO PUE veranito veraniego");
        pue.setDuracion(80L);
        pue.setEspecialidad(Especialidad.DAM);
        asignaturaRepository.save(pue);

        Profesor p = new Profesor();
        p.setNombre("Alfredo");
        p.setApellido("Rueda Unsain");
        p.setSalario(99999L);
        p.setAsignatura(pue);
        profesorRepository.save(p);

        p = new Profesor();
        p.setNombre("Canovas");
        p.setSalario(100L);
        profesorRepository.save(p);
    }
}

