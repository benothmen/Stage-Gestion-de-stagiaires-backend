package cpg.org.servicefaculte.Repository;

import cpg.org.servicefaculte.Entities.Faculte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FaculteRepository extends JpaRepository<Faculte, Long> {
}
