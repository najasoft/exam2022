package iir4.spring.exams.exam2022.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "cours_en_ligne")
public class CoursEnLigne extends Cours {
    private String url;
}