package cpg.org.serviceevaluation.Repository;

import cpg.org.serviceevaluation.Entities.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EvaluationRepository extends JpaRepository<Evaluation,Long> {
}
