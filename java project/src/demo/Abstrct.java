package demo;

public class Abstrct extends Abstraction{
	
	
	@Override
	void add() {
		System.out.println("abstraction");
		
	}
	
	
	
	

	public static void main(String[] args) {
		Abstrct ab = new Abstrct ();
		ab.add();

	}

	

}
