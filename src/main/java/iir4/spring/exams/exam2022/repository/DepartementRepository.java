package iir4.spring.exams.exam2022.repository;

import iir4.spring.exams.exam2022.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}