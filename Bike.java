package learn.hibernate3.moto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Bike {
@Id
int modelNum;
String brand;
@ManyToOne
Rider rider;
public Bike() {
	super();
	// TODO Auto-generated constructor stub
}
public Bike(int modelNum, String brand, Rider rider) {
	super();
	this.modelNum = modelNum;
	this.brand = brand;
	this.rider = rider;
}
public int getModelNum() {
	return modelNum;
}
public void setModelNum(int modelNum) {
	this.modelNum = modelNum;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Rider getRider() {
	return rider;
}
public void setRider(Rider rider) {
	this.rider = rider;
}
@Override
public String toString() {
	return "Bike [modelNum=" + modelNum + ", brand=" + brand + ", rider=" + rider + "]";
}

}
