package com.array;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("please enter the input string:");
String input=sc.nextLine();
System.out.println("please enter the target character:");
char targetchar=sc.next().charAt(0);
System.out.println("Input:"+input);
System.out.println("Target chracter:"+targetchar);
int count=0;
for(int i=0;i<input.length();i++) {
	if(input.charAt(i)==targetchar)
		count++;
}
	System.out.println("Output:"+count);
	sc.close();
}
	}


