package user.com.br.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class AppConfig {
	
	@Bean
	public BCryptPasswordEncoder passWordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
