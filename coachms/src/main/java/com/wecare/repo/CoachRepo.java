package com.wecare.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecare.entity.CoachEntity;
@SuppressWarnings("unused")
@Repository
public interface CoachRepo extends JpaRepository<CoachEntity, Integer>{

	Optional<CoachEntity> findByPasswordAndCoachId(String Password,Integer CoachId);
	Optional<CoachEntity> findByCoachId(Integer CoachId);

}
