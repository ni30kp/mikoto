package com.wecare.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecare.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer>{

	Optional<UserEntity> findByPasswordAndUserId(String Password,Integer UserId);
	Optional<UserEntity> findByUserId(Integer UserId);

//	
//	Optional<UserEntity> findBySourceAndDestination(String source,String destination);
//	
//	@Query(value = "SELECT count(*) FROM route WHERE source = ?1 and destination=?2", nativeQuery = true)
//	Long findRows(String source,String destination);
//	
}
