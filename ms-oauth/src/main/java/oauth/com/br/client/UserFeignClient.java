package oauth.com.br.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oauth.com.br.domain.model.User;

@Component	
@FeignClient(name = "ms-user", path = "/users")
public interface UserFeignClient {
	
	@GetMapping("/search")
	ResponseEntity<User> getUserByEmail(@RequestParam  String email);

}
