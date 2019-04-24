package jpa;

import java.util.Date;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RdvRepository extends CrudRepository<Rdv, Date> {
	
	List<Rdv> findByDate(Date date);

}