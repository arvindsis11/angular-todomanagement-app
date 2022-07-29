package com.arvind.usermanagement.UserController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arvind.usermanagement.Model.User;
import com.arvind.usermanagement.UserRepository.UserRepo;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    private UserRepo userRepo;
	
	@GetMapping
	public List<User> findAllUsers(){
		return (List<User>) userRepo.findAll();
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return ResponseEntity.ok().body(user.get());	
		}
		return ResponseEntity.notFound().build();
		
	}
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userRepo.save(user);
		//return "user details saved successfully!";
	}
	@PutMapping("/{id}")
	public User updateUser(@PathVariable(value="id") long id,@RequestBody User newUser) {
		Optional<User> update = userRepo.findById(id);
		return update
		.map(user->{
			user.setName(newUser.getName());
			user.setEmail(newUser.getEmail());
			return userRepo.save(user);
		}).orElseGet(()->{
			newUser.setId(id);
			return userRepo.save(newUser);
		});
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value="id") Long id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			userRepo.deleteById(id);
			return ResponseEntity.ok().body(user.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
}
