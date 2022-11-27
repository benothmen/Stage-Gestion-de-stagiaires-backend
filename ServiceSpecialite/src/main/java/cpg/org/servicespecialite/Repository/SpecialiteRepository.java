package cpg.org.servicespecialite.Repository;

import cpg.org.servicespecialite.Entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SpecialiteRepository extends JpaRepository<Specialite, Long> {
}
