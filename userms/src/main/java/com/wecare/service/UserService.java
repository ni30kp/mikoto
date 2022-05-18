package com.wecare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.DTO.LoginDTO;
import com.wecare.DTO.UserDTO;
import com.wecare.entity.UserEntity;
import com.wecare.repo.UserRepo;

@Service
public class UserService{
	
	@Autowired
	UserRepo userRepo;
	public Integer addUser(UserDTO userDTO) {
			UserEntity en=UserDTO.change(userDTO);
			userRepo.saveAndFlush(en);
			return en.getUserId();
	}
	public Boolean loginUser(LoginDTO loginDTO) {
		Optional<UserEntity> en=userRepo.findByPasswordAndUserId(loginDTO.getPassword(),loginDTO.getId());
		if(en.isPresent()) {
			return true;
		}
		return false;
	}
	public UserDTO getUserProfile(Integer id) {
		Optional<UserEntity> ent= userRepo.findByUserId(id);
		if(ent.isPresent()) {
			UserDTO dto= UserDTO.changeTo(ent.get());
			return dto;
		}
		return null;
	}

//	
//	public RouteDTO fetchTrain(String source,String destination) {
//		Optional<RouteEntity> ent=routeRepo.findBySourceAndDestination(source, destination);
//		if(ent.isPresent()) {
//			return  RouteDTO.changeTo(ent.get());
//		}
//		return null;
//	}
//	public RouteDTO searchRoute(Integer id) {
//		Optional<RouteEntity> ent= routeRepo.findById(id);
//		if(ent.isPresent()) {
//			RouteDTO dto= RouteDTO.changeTo(ent.get());
//			return dto;
//		}
//		return null;
//	}
//	public RouteDTO updateRoute(String id,String source,String destination) {
//		Optional<RouteEntity> ent=routeRepo.findById(Integer.parseInt(id));
//		if(ent.isPresent()) {
//			RouteEntity entity=ent.get();
//			entity.setSource(source);
//			entity.setDestination(destination);
//			routeRepo.saveAndFlush(entity);
//			RouteDTO routeDTO=RouteDTO.changeTo(entity);
//			return routeDTO;
//		}
//		return null;
//	}
//	
	
}
