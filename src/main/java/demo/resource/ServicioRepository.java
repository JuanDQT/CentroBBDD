package demo.resource;

import demo.model.Servicio;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Juan Daniel on 29/06/2015.
 */
public interface ServicioRepository extends PagingAndSortingRepository<Servicio, Long> {
}
