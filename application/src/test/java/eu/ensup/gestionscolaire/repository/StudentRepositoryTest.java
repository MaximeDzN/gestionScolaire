package eu.ensup.gestionscolaire.repository;

import eu.ensup.gestionscolaire.domain.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@ActiveProfiles("test")
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    private Student s1;

    @BeforeEach
    public void setUp() {
        s1 = new Student(0L, "dazin", "14 rue chèvre", "0612401108", "maxime.dazin@gmail.com", "maxime", new Date());
    }

    @Test
    public void save(){
        studentRepository.save(s1);
        Student fetchedStudent = studentRepository.getById(1L);
        assertEquals(1L,fetchedStudent.getId());
    }


}