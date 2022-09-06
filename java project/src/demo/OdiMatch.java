package demo;

import java.util.Scanner;

public class OdiMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int current_temp = 24;
    if(current_temp>30) {
    	System.out.println("its hot and can proced with the match");
    }
    else 
    	if(current_temp>=20 && current_temp<30) {
    		System.err.println("Mild Temperature");
    	}
    	else
    	{
    	System.err.println("Not a Good Weather");	
    	
    }
    Scanner team1 = new Scanner(System.in);
    Scanner team2 = new Scanner(System.in);
    System.err.println("Enter The Score is England");
    int England =team1.nextInt();
    System.err.println("England score is:"+England);
    System.err.println("Enter the score fof India");
    int India = team2.nextInt();
    System.err.println("India score is:"+India);
    if (England>India) {
    	System.err.println("England won the match");
    }
    else
    //	Scanner team1=new Scanner("230");
   // Scanner team2=new Scanner("232");
    System.err.println();
    {
    }
	}

}