package eu.ensup.gestionscolaire.domain;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    private Person person;

    @BeforeEach
    private void setUp(){
        person = new Person();
    }

    @Test
    void setId() {
        person.setId(1L);
        assertEquals(person.getId(),1L);
    }

    @Test
    void setName() {
        person.setName("maxime");
        assertEquals(person.getName(),"maxime");
    }

    @Test
    void setAddress() {
        person.setAddress("14 rue saintes");
        assertEquals(person.getAddress(),"14 rue saintes");
    }

    @Test
    void setPhone() {
        person.setPhone("0612401108");
        assertEquals(person.getPhone(),"0612401108");
    }

    @Test
    void setMail() {
        person.setMail("maxime.dazin@gmail.com");
        assertEquals(person.getMail(),"maxime.dazin@gmail.com");
    }

    @Test
    void testToString() {
        String expected = "Person(id=null, name=null, address=null, phone=null, mail=null)";
        assertEquals(expected,person.toString());
    }
}