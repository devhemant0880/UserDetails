package com.votingSystem;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("/user")
	public User enterUser(@RequestBody User user) {
		return UserService.addUser(user);
	}
	@GetMapping("/user")
	public List<User> getLimitedUsers(@RequestParam("limit") int count) {
		return UserService.getUsers(count);
	}
	
	@GetMapping("/user/ages")
	public List<User> getLimitedWithMaxAges(@RequestParam("gt") int count) {
		return UserService.maxage(count);
	}

}
