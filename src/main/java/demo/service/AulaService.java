package demo.service;

import demo.model.Aula;
import demo.model.Servicio;
import demo.model.Turno;
import demo.resource.AulaRepository;
import demo.resource.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Juan Daniel on 29/06/2015.
 */
@Service
public class AulaService {
    @Autowired
    private AulaRepository aulaRepository;
    @Autowired
    private ServicioRepository servicioRepository;

    public void testAula(){
        Aula a = new Aula();
        a.setCapacidad(20L);
        aulaRepository.save(a);

        Servicio s = new Servicio();
        s.setNombre("Maria");
        s.setApellido("Dolores");
        s.setTurno(Turno.MANANA);
        servicioRepository.save(s);
        //a.setServicios(s);
    }
}
