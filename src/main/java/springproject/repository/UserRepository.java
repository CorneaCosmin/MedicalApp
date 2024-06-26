package springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import springproject.model.Patient;

@Component
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
