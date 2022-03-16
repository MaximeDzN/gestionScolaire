package eu.ensup.gestionscolaire.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
public class School extends Person{

    @OneToOne
    private Director director;

}
