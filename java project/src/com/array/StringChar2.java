package com.array;

import java.util.Scanner;

public class StringChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the lol string:");
		String lol=sc.nextLine();
		System.out.println("please enter the target character:");
		char targetchar=sc.next().charAt(0);
		System.out.println("Lol:"+lol);
		System.out.println("Target chracter:"+targetchar);
		int count=0;
		for(int i=0;i<lol.length();i++) {
			if(lol.charAt(i)==targetchar)
				count++;
		}
			System.out.println("Output:"+count);
			sc.close();
		}
			}

	
