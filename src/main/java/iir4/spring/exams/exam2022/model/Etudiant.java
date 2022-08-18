package iir4.spring.exams.exam2022.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;
@Data
@Entity
public class Etudiant extends Personne {
    private LocalDate dateInscription;
    @ManyToMany
    private List<Cours> lesCours;
}