package user.com.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import user.com.br.domain.model.User;
import user.com.br.service.impl.UserServiceImpl;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/new-user")
	public ResponseEntity<String> saveNewUser(@RequestBody User newUser) {
		userService.saveNewUser(newUser);
		return ResponseEntity.ok("Salvo com sucesso");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserByEmail(@PathVariable Long id) {
		User userResponse = userService.getUserById(id);
		return ResponseEntity.ok(userResponse);
	}
	
	@GetMapping("/get-user")
	public ResponseEntity<User> getUserByEmail(@PathVariable  String email) {
		User userResponse = userService.getUserByEmail(email);
		return ResponseEntity.ok(userResponse);
	}
	
	

}
