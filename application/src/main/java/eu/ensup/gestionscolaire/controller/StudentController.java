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

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
    public String createStudent(@ModelAttribute("studentForm") final Student student, HttpSession session){
        studentRepository.save(student);
        session.setAttribute("info","étudiant créé avec succès");
        return "studentCreate";
    }

}
