package cpg.org.servicespecialite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Specialite extends JpaRepository<Specialite, Long> {
}
