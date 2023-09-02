package user.com.br.service;

import java.util.Optional;

import user.com.br.domain.model.User;

public interface UserService {
	
	User saveNewUser(User user);
	
	User getUserByEmail(String email);

	User getUserById(Long id);

}
