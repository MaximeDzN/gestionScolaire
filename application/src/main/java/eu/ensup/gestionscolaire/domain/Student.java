package eu.ensup.gestionscolaire.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Student extends PhysicPerson {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    @ManyToMany
    private List<Course> courses;

    public Student(Long id, String name, String address, String phone, String mail, String firstName, Date birthDate) {
        super(id, name, address, phone, mail, firstName);
        this.birthDate = birthDate;
    }
}
