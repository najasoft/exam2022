package iir4.spring.exams.exam2022.controller;

import iir4.spring.exams.exam2022.model.CoursEnClasse;
import iir4.spring.exams.exam2022.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    CoursRepository cr;


    @GetMapping
    public List<CoursEnClasse> get(){
        return cr.getCoursEnClasse();
    }
}


