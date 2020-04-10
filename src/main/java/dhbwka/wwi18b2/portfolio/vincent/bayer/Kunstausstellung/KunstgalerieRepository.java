package dhbwka.wwi18b2.portfolio.vincent.bayer.Kunstausstellung;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 * Spring Data Repository für die Kunstgalerie-Entität.
 */
@RepositoryRestResource(collectionResourceRel = "kunstgalerie", path = "kunstgalerie")
public interface KunstgalerieRepository extends PagingAndSortingRepository<Kunstgalerie, Long> {
    // Bleibt leer, wird von Spring generiert
}
