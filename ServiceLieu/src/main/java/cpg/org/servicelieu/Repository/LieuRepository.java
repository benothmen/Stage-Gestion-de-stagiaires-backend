package cpg.org.servicelieu.Repository;

import cpg.org.servicelieu.Entities.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LieuRepository extends JpaRepository<Lieu, Long> {

}
