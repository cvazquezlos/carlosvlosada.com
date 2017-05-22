package carlosvlosada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carlosvlosada.model.User;
import carlosvlosada.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findByNickName(String nickName) {
		return userRepository.findByNickName(nickName);
	}
}