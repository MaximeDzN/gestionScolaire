package eu.ensup.gestionscolaire.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    private void setUp(){
        student = new Student();
    }

    @Test
    void setBirthDate() {
        Date d = new Date();
        student.setBirthDate(d);
        assertEquals(student.getBirthDate(),d);
    }

    @Test
    void setCourses() {
        student.setCourses(new ArrayList<>());
        assertEquals(student.getCourses(),new ArrayList<>());
    }

    @Test
    void testToString() {
        String expected = "Student(birthDate=null, courses=null)";
        assertEquals(expected,student.toString());
    }
}