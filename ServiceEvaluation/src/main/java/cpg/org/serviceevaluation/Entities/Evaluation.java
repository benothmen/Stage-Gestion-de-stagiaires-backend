package cpg.org.serviceevaluation.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Check;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Evaluation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private byte discipline;
    private byte respect;
    private byte integrite;
    private byte connaissances;
    private byte qualite;
    private byte totale;
    private String remarque;
    private Long stageId;
}
