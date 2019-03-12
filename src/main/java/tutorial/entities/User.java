package tutorial.entities;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	
	
	private int Id;
	
	@Size(min=4, max= 255, message="Name should have at least 4 characters and no more than 255 of length.")
	private String Name;
	
	@Past
	private Date BirthDay;
	
	public User(int id, String name, Date birthDay) {
		super();
		Id = id;
		Name = name;
		BirthDay = birthDay;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;
	}
	
	

}
