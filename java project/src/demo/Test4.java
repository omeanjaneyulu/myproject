package demo;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long starTime = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("java");
		
 for (int i=0;i<100000;i++) {
	 sb.append("vtalent");
	 
 }
		System.out.println("time taken by StringBuilder:"+(System.currentTimeMillis()-starTime)+"ms");
	}



	}


