package iir4.spring.exams.exam2022.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cours {
	@Id
	private int coursId;
	private String titre;
	private int credits;
	@ManyToOne
	Departement departement;
	}
