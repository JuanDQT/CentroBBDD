package demo.service;

import demo.model.Alumno;
import demo.resource.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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
        a.setFechaNacimiento(LocalDate.of(1993,07,24));
        alumnoRepository.save(a);
    }
}
