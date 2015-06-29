package demo.resource;

import demo.model.Alumnos;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Juan Daniel on 26/06/2015.
 */
public interface AlumnosRepository extends PagingAndSortingRepository<Alumnos, Long> {
}
