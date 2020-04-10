package dhbwka.wwi18b2.portfolio.vincent.bayer.Kunstausstellung;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 * Spring Data Repository für die Gemaelde-Entität.
 */
@RepositoryRestResource(collectionResourceRel = "gemaelde", path = "gemaelde")
public interface GemaeldeRepository extends PagingAndSortingRepository<Gemaelde, Long> {
    // bleibt leer, wird automatisch durch Spring gemacht
}
