package scratchDemo;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("what is your name");
    String name=sc.nextLine();
   System.out.printf("hi %s,how are you?",name);
   sc.nextLine();
   System.out.println("what is your age");
   sc.nextLine();
   System.out.println("where are you from");
   sc.nextLine();
   System.out.println("thank you for the infermation");
   sc.close();
	}

}
