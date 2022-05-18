package com.wecare.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wecare.DTO.CoachDTO;
import com.wecare.DTO.LoginDTO;
import com.wecare.entity.CoachEntity;
import com.wecare.repo.CoachRepo;


@SuppressWarnings("unused")
@Service
public class CoachService {

	
	@Autowired
	CoachRepo coachRepo;
	
	public Integer addUser(CoachDTO coachDTO) {
		CoachEntity en=CoachDTO.change(coachDTO);
		coachRepo.saveAndFlush(en);
		return en.getCoachId();
	}
	public Boolean loginUser(LoginDTO loginDTO) {
		Optional<CoachEntity> en=coachRepo.findByPasswordAndCoachId(loginDTO.getPassword(),loginDTO.getId());
		if(en.isPresent()) {
			return true;
		}
		return false;
	}
	public CoachDTO getCoachProfile(Integer id) {
		Optional<CoachEntity> ent= coachRepo.findByCoachId(id);
		if(ent.isPresent()) {
			CoachDTO dto= CoachDTO.changeTo(ent.get());
			return dto;
		}
		return null;
	}
	public List<CoachDTO> showAllCoaches(){
	
	List<CoachEntity> ents=coachRepo.findAll();
	List<CoachDTO> dto=new ArrayList<>();
	for(CoachEntity ent:ents) {
		dto.add(CoachDTO.changeTo(ent));
	}
	return dto;
}
		
	
//	public void addTrain(Integer id,TrainDTO trainDTO) {
//		trainDTO.setRouteId(id);
//		trainRepo.saveAndFlush(TrainDTO.changesTo(trainDTO));
//	}
//	
//	public List<TrainDTO> fetchTrains(Integer routeId){
//		
//		List<TrainEntity> ents=trainRepo.findByRouteId(routeId);
//		List<TrainDTO> dto=new ArrayList<>();
//		for(TrainEntity ent:ents) {
//			dto.add(TrainDTO.changes(ent));
//		}
//		return dto;
//	}
//	
//	public void delete(Integer id,Integer rid) {
//		trainRepo.deleteByIdAndRouteId(id,rid);		
//	}
//	public String updateTrain(Integer id, String fare) {
//		
//		Optional<TrainEntity> en=trainRepo.findById(id);
//		try {
//			TrainEntity tent=en.get();
//			tent.setFare(Double.parseDouble(fare));
//			trainRepo.saveAndFlush(tent);
//			return "Success: Fare gets Updated";
//		} catch (Exception e) {
//			return "Failed: Could not update the fare";
//			// TODO: handle exception
//		}
//	}
	
}
