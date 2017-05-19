package carlosvlosada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByNickName(String nickName);
}