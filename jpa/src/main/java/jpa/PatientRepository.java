package jpa;


import org.springframework.data.repository.CrudRepository;

import jpa.Patient;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, String> {
    List<Patient> findByName(String name);

}