package iir4.spring.exams.exam2022.repository;

import iir4.spring.exams.exam2022.model.Cours;
import iir4.spring.exams.exam2022.model.CoursEnClasse;
import iir4.spring.exams.exam2022.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
    Cours findByTitre(String titre);
    @Query("Select c from CoursEnClasse c")
    List<CoursEnClasse> getCoursEnClasse();
    @Query("select e from Etudiant e join e.lesCours c where c.titre =:titre")
    List<Etudiant> getEtudiants(@Param("titre") String titre);
    @Query("select c from Cours c where c.credits > :cr ")
    List<Cours>  getCours(@Param("cr") int credits);
}