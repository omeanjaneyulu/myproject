package scratchDemo;

public class Encapsulation {
private int id;
private String name;
private String address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public static void main(String[]args) {
	Encapsulation en=new Encapsulation();
	en.setId(22);
	System.out.println(en.getId());
	en.setName("yoshi");
	System.out.println(en.getName());
	en.setAddress("mutyalapalli");
	System.out.println(en.getAddress());
			
}
}
