package oauth.com.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import oauth.com.br.service.impl.UserServiceImpl;
import oauth.com.br.domain.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/search")
	public ResponseEntity<User> getUserByEmail(@RequestParam  String email) {
		User userResponse = userService.getUserByEmail(email);
		return ResponseEntity.ok(userResponse);
	}	

}
