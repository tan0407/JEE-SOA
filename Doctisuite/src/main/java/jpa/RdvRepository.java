package jpa;

import java.util.Date;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RdvRepository extends CrudRepository<Rdv, Long> {
	
	//The day MUST BE AT ddmmyy format
	List<Rdv> findByDate(Date day);

}