package eu.ensup.gestionscolaire.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PhysicPersonTest {

    private PhysicPerson physicPerson;

    @BeforeEach
    private void setUp(){
        physicPerson = new PhysicPerson();
    }

    @Test
    void setFirstName() {
        physicPerson.setFirstName("maxime");
        assertEquals(physicPerson.getFirstName(),"maxime");
    }
}