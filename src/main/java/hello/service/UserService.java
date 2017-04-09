package hello.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import hello.entity.User;
import hello.repository.UserRepository;

@Service
public class UserService {

	@Inject
	private UserRepository userRepository;

	public User findOne(long id) {
		return userRepository.findOne(id);
	}
	
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

}
