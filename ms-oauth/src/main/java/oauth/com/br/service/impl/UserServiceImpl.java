package oauth.com.br.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oauth.com.br.client.UserFeignClient;
import oauth.com.br.domain.model.User;
import oauth.com.br.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	@Override
	public User getUserByEmail(String email) {
		User user = userFeignClient.getUserByEmail(email).getBody();
		if (user == null) {
			logger.error("Email not found" + email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email found" + email);
		return user;
	}

}
