package iir4.spring.exams.exam2022.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Departement {
	@Id
	private int depId;
	private String nom;
	private double budget;
}
