package learn.hibernate3.moto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rider {
	@Id
	int id;
	String name;
	int age;
	@OneToMany
	List<Bike>bikeList;
	public Rider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rider(int id, String name, int age, List<Bike> bikeList) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bikeList = bikeList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Bike> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}
	@Override
	public String toString() {
		return "Rider [id=" + id + ", name=" + name + ", age=" + age + ", bikeList=" + bikeList + "]";
	}

}
