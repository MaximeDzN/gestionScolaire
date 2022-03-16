package eu.ensup.gestionscolaire.domain;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

    private static Course course;

    @BeforeEach
    private void setUp(){
        course=  new Course(1L,"dev",12, new ArrayList<>());
    }

    @Test
    void testToString() {
        String expected = "Course(id=1, subject=dev, hours=12, studentList=[])";
        assertEquals(expected,course.toString());
    }
}