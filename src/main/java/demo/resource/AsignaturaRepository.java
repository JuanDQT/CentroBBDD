package demo.resource;

import demo.model.Asignatura;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Juan Daniel on 26/06/2015.
 */
public interface AsignaturaRepository extends PagingAndSortingRepository<Asignatura, Long> {
}
