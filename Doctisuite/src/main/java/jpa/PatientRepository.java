package jpa;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findByName(String name);

}