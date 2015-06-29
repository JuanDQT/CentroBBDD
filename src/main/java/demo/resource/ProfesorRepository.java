package demo.resource;

import demo.model.Profesor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Juan Daniel on 26/06/2015.
 */
public interface ProfesorRepository extends PagingAndSortingRepository<Profesor, Long> {
}
