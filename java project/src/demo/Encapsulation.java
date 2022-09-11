package demo;

public class Encapsulation {
	private int id;
	private String name;
	private long mobileno;
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public static void main(String[]args) {
		Encapsulation en = new Encapsulation();
		en.setId(1);
		System.out.println(en.getId());
		en.setName("manu");
		System.out.println(en.getName());
		en.setMobileno(91211980);
		System.out.println(en.getMobileno());
	}
}


