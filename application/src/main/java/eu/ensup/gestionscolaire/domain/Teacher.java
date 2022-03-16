package eu.ensup.gestionscolaire.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Teacher extends PhysicPerson {

    private String subject;

}
