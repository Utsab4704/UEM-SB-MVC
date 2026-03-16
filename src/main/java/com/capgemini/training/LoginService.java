package com.capgemini.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	public UserEntity registerUser(UserEntity userentity) {
		return loginRepository.save(userentity);
	}
	public boolean validateUser(String email, String password) {

        UserEntity user = loginRepository.findByEmail(email);

        if(user != null && user.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
	public void updatePassword(String email, String password) {
        UserEntity user = loginRepository.findByEmail(email);

        if(user != null) {
            user.setPassword(password);
            loginRepository.save(user);
        }
    }
}
