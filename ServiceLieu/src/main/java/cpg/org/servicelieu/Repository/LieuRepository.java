package cpg.org.servicelieu.Repository;

import cpg.org.servicelieu.Entities.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface LieuRepository extends JpaRepository<Lieu, Long> {
    @RestResource(path ="noms")
    List<Lieu> findByNomContains();
}
