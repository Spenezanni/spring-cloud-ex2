package oauth.com.br.service;

import oauth.com.br.domain.model.User;

public interface UserService {
	
	public User getUserByEmail(String email);

}
