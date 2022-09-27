package demo;




import java.util.HashMap;
import java.util.Random;

public class ProbabilityExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rn=new Random();
Integer no=rn.nextInt(10);
HashMap<Integer,String> m=new HashMap<Integer,String>();
m.put(1,"Green");
m.put(2, "Green");
m.put(3, "Green");
m.put(4, "Green");
m.put(5, "Red");
m.put(6, "Red");
m.put(7, "Red");
m.put(8, "Blue");
m.put(9, "Blue");
m.put(10, "Blue");
if(no==1 || no==2 || no==3 || no==4) {
	System.out.println("color is Green and"+no);
}
else  {
if(no==5 || no==6 || no==7 || no==8) {
	
}else {
	System.out.println("color is Red and"+no);
}
}


	}

}
