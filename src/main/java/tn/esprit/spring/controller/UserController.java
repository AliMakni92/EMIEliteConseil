package tn.esprit.spring.controller;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.DAO.UserRepository;
import tn.esprit.spring.entity.User;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/users")
	public List<User>getUsers(){
		return userRepository.findAll();
	}
	@GetMapping("/user/{idUser}")
	public User getUser(@PathVariable Long idUser){
		return userRepository.findOne(idUser);
	}
	@DeleteMapping("/user/{idUser}")
	public boolean deleteUser(@PathVariable Long idUser){
		userRepository.delete(idUser);
		return true;
	}
	@PostMapping("/user")
	public User createUser(User user ){
		return userRepository.save(user);
		
	}
	@PutMapping("/user/{idUser}")
	public User updateUser( @RequestBody User user ,@PathVariable Long idUser){
		User ManagedEntity= userRepository.findOne(idUser);
		if(ManagedEntity == null){
			throw new NoResultException();
		}
		ManagedEntity.setNom(user.getNom());
		ManagedEntity.setPrenom(user.getPrenom());
		ManagedEntity.setLogin(user.getLogin());
		return userRepository.save(ManagedEntity);
		
	}
}
