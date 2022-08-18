package iir4.spring.exams.exam2022.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
public class CoursEnClasse extends Cours {
    private String emplacement;
    private LocalDate date;
}