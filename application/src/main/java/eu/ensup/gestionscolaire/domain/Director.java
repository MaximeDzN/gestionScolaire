package eu.ensup.gestionscolaire.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
public class Director extends PhysicPerson {

    @OneToOne
    private School school;

}
