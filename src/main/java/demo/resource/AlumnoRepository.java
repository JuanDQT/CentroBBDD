package demo.resource;

import demo.model.Alumno;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Juan Daniel on 26/06/2015.
 */

public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {
}
