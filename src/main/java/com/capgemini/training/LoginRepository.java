package com.capgemini.training;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserEntity, Integer>{
	UserEntity findByEmail(String email);
	UserEntity findByUsername(String username);

    UserEntity findByEmailOrUsername(String email, String username);

}
