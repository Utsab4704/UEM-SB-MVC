package com.capgemini.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	
	@GetMapping("/")
	public String loginPage() {
		return "login.jsp";
	}
	
	@PostMapping("/login")
	public String validate(@RequestParam String user,@RequestParam String password) {
		
		System.out.println(user);
		System.out.println(password);
		if(loginService.validateUser(user, password)){
            return "home.jsp";
        }
		return "login.jsp";
	}
	
	
	
	@PostMapping("/register")
	public String register(HttpServletRequest request){
		String empId = request.getParameter("empId");
        String userName = request.getParameter("user");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println("Emp Id : " + empId);
        System.out.println("Emp name : " + userName);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        
        UserEntity userEntity = new UserEntity();
        
        userEntity.setUsername(userName);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        
        loginService.registerUser(userEntity);
		return "login.jsp";
	}
	
	@PostMapping("/forgotpassword")
	public String forgotPassword(@RequestParam String email, Model model) {

	    System.out.println("Email entered : " + email);

	    model.addAttribute("email", email);

	    return "resetPassword.jsp";
	}	
	@PostMapping("/resetpassword")
	public String resetPassword(
	        @RequestParam String email,
	        @RequestParam String password,
	        @RequestParam String confirmpassword) {

	    if(password.equals(confirmpassword)) {

	        loginService.updatePassword(email, password);

	        System.out.println("Password Updated");

	        return "login.jsp";
	    } 
	    else {
	        System.out.println("Password mismatch");
	        return "resetPassword.jsp";
	    }
	}
	
	
}