package eu.ensup.gestionscolaire.controller;


import eu.ensup.gestionscolaire.domain.Student;
import eu.ensup.gestionscolaire.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping
    public String viewStudentCreate(Model model) {
        return "studentCreate";
    }

    @PostMapping
    public String createStudent(@ModelAttribute("studentForm") final Student student){
        studentRepository.save(student);
        return "redirect:/home";
    }

}
