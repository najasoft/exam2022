package iir4.spring.exams.exam2022.controller;

import iir4.spring.exams.exam2022.model.CoursEnClasse;
import iir4.spring.exams.exam2022.repository.CoursRepository;
import iir4.spring.exams.exam2022.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    private CoursRepository cr;
    @Autowired
    private DepartementRepository dr;

    @GetMapping
    public String liste(Model m){
        m.addAttribute("liste",cr.findAll());
        return "cours/liste";
    }
    @GetMapping("/add")
    public String ajout (Model m){
        m.addAttribute("cours",new CoursEnClasse());
        m.addAttribute("deps",dr.findAll());
        return "cours/ajoutCours";
    }
    @PostMapping("/add")
    public String ajout (@ModelAttribute CoursEnClasse cours){
    	cr.save(cours);
        return  "redirect:/cours/add";
    }
}
