package iir4.spring.exams.exam2022.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import lombok.Data;

@Data
@Entity
@Inheritance
public class Personne {
	@Id
	private long pId;
	private String nom;
	private String email;

}
