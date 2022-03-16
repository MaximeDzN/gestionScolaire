package eu.ensup.gestionscolaire.repository;

import eu.ensup.gestionscolaire.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
