package user.com.br.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.com.br.domain.model.User;
import user.com.br.repository.UserRepository;
import user.com.br.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveNewUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get() ;
	}

}
