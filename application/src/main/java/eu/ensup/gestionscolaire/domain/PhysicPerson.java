package eu.ensup.gestionscolaire.domain;


import lombok.*;

import javax.persistence.Entity;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class PhysicPerson extends Person {
    private String firstName;

    public PhysicPerson(Long id, String name, String address, String phone, String mail, String firstName) {
        super(id, name, address, phone, mail);
        this.firstName = firstName;
    }


}
