package ws;

import jpa.Patient;
import jpa.PatientRepository;
import jpa.Rdv;
import jpa.RdvRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {

	@Autowired
	PatientRepository patientRepo;
	@Autowired
	RdvRepository rdvRepo;
	
 
	public WebApp(PatientRepository patientRepo, RdvRepository rdvRepo) {
		this.patientRepo = patientRepo;
		this.rdvRepo = rdvRepo;
	}


	/*@RequestMapping(value="/todaysrdv", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Iterable<Rdv> getTodaysrdv() throws Exception{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = dateFormat.parse("31-12-2019");
		return rdvRepo.findByDate(date);
	}*/
	@RequestMapping(value="/todaysdv", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Iterable<Rdv> getTodaysrdv() throws Exception{
	//	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	//	Date date = dateFormat.parse("31-12-2019");
	//	return rdvRepo.findByDate(date);
		return rdvRepo.findAll();
	}
/*	public void addRdv(@RequestBody Patient patient) {
		rdvRepo.add(patient);
	}
*/
}
