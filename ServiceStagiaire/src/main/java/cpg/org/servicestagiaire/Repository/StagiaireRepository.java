package cpg.org.servicestagiaire.Repository;

import cpg.org.servicestagiaire.Entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StagiaireRepository extends JpaRepository<Stagiaire,Long> {
}
