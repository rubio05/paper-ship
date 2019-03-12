package tutorial;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import tutorial.DAO.UserDaoService;
import tutorial.entities.User;
import tutorial.exceptions.UserNotFoundException;


@RestController
public class UserController {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping(path="/hello")
	public String helloWorld () {
		return "Hello World!";
	}

	@GetMapping(path="/users")
	public List<User> getAllUsers (){

		return service.FindAll();

	}
	
	@GetMapping(path = "/users/{id}")
	public User getUser (@PathVariable int id) {

		User user = service.FindOne(id);

		if (user == null) 
			throw new UserNotFoundException("id="+id);
			
		return user;
	}

	@PostMapping(path="/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User u = service.Save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping(path = "/users/{id}")
	public void deletUser (@PathVariable int id) {

		User user = service.Delete(id);

		if (user == null) 
			throw new UserNotFoundException("id="+id);

	}

}
