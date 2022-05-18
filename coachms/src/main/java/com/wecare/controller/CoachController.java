package com.wecare.controller;

import java.util.List;

import javax.ws.rs.DELETE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wecare.DTO.BookDTO;
import com.wecare.DTO.CoachDTO;
import com.wecare.DTO.LoginDTO;
import com.wecare.service.CoachService;



@SuppressWarnings("unused")
@RestController
@CrossOrigin
public class CoachController {
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	RestTemplate template;
	@Autowired
	CoachService coachService ;
	
	@PostMapping(value = "/coaches",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> createCoach(@RequestBody CoachDTO coachDTO) {
	Integer id= coachService.addUser(coachDTO);
	return ResponseEntity.ok(id);
	
	}
	
	@PostMapping(value = "/coaches/login",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> loginUser(@RequestBody LoginDTO loginDTO) {
	return ResponseEntity.ok(coachService.loginUser(loginDTO));
	}

	@GetMapping(value = "/coaches/{coachId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CoachDTO> getCoachProfile(@PathVariable("coachId") Integer id){
		CoachDTO coachDTO=coachService.getCoachProfile(id);
		return ResponseEntity.ok(coachDTO);
	}
	@GetMapping(value = "/coaches/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CoachDTO>> showAllCoaches(){
		List<CoachDTO> coachDTO=coachService.showAllCoaches();
		return ResponseEntity.ok(coachDTO);
	}
	@GetMapping(value = "/coaches/booking/{coachId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BookDTO>> showBook(@PathVariable("coachId") Integer id){
		@SuppressWarnings("unchecked")
		List<BookDTO> tdto= template.getForObject("http://BOOKMS//booking/coaches/"+id, List.class);
		System.out.println(tdto);
		return ResponseEntity.ok(tdto);
	}
	
//	@GetMapping(value = "/users/booking/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<CoachDTO>> showMyAppointments(String userId){
//		List<CoachDTO> coachDTO=coachService.showAllCoaches();
//		return ResponseEntity.ok(coachDTO);
//	}
	
	
	
	
	
//	@Autowired
//	TrainService trainService;
//	@PostMapping(value = "/route/{routeId}",  consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void createTrain(@PathVariable("routeId") Integer id,@RequestBody TrainDTO trainDTO) {
//		trainService.addTrain(id,trainDTO);
//	}	
//	
//	
//	@GetMapping(value = "/route/{routeId}",produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<TrainDTO> searchTrains(@PathVariable("routeId") Integer id){
//		return trainService.fetchTrains(id);	
//	}
//	
//	@DeleteMapping(value="/{routeId}/{trainId}")
//	public void deleteTrain(@PathVariable("trainId") Integer id,@PathVariable("routeId") Integer rid) {
//		trainService.delete(id,rid);
//	}
//	@PutMapping(value = "/trains/{trainId}")
//	public String updateTrain(@PathVariable("trainid") Integer id,@RequestParam String fare)  								  
//	{
//		System.out.println("fare "+fare);
//		return trainService.updateTrain(id,fare);
//	}
	
}
