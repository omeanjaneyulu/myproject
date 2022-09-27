package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new  ArrayList<String>();
/*al.add("Mango");
al.add("Apple");
al.add("Banana");
al.add("Grapes");
System.out.println(al);  */


al.add("Mango");
al.add("Apple");
al.add("Banana");
al.add("Grapes");
Iterator it=al.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
	}

}
