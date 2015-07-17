package demo.service;

import demo.model.Alumno;
import demo.model.Especialidad;
import demo.resource.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Juan Daniel on 05/07/2015.
 */
@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public void testAlumno(){
        Alumno a = new Alumno();
        a.setNombre("Antonio");
        a.setApellido("Rodriguez");
        a.setEspecialidad(Especialidad.DAM);
        alumnoRepository.save(a);

    }
}
