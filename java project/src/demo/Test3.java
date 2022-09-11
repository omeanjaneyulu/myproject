package demo;

public class Test3 {

	public static void main(String[] args) {
		long starTime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("java");
		
 for (int i=0;i<100000;i++) {
	 sb.append("vtalent");
	 
 }
		System.out.println("time taken by StringBuffer:"+(System.currentTimeMillis()-starTime)+"ms");
	}

}
