package demo.resource;

import demo.model.Aula;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Juan Daniel on 29/06/2015.
 */
public interface AulaRepository extends PagingAndSortingRepository<Aula, Long> {
}
