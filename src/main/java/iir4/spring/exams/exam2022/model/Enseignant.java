package iir4.spring.exams.exam2022.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Enseignant extends Personne {
    private LocalDate dateEmbauche;
    @ManyToMany
    private List<Cours> lesCours;
}