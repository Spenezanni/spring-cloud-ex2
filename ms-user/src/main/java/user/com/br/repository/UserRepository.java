package user.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user.com.br.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
