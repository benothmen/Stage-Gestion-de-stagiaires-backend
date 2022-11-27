package cpg.org.servicestage.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.soap.Text;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Stage {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private String sujet;
    private Long stagiaireId;
    private Long typeId;
    private Long lieuId;
}
