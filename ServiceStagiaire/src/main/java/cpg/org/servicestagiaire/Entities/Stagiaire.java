package cpg.org.servicestagiaire.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Stagiaire {
    @Id
    private Long cin;
    private String codeDossier;
    private String NumeroDossier;
    private String nom;
    private String prenon;
    private Long facId;
    private Long specialiteId;

}
