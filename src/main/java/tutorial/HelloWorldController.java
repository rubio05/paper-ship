package tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import beans.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String HelloWorld () {
		return "Hello World!";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean HelloWorldBean () {
		return new HelloWorldBean("HelloWorldBean");
	}
	
	@GetMapping(path="/hello-world-bean/var/{name}")
	public HelloWorldBean HelloWorldWithVar(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello,  %s", name));  
	}
}
