package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String> hp=new HashMap<Integer,String>();
     hp.put(1, "Mango");
     hp.put(2, "Apple");
     hp.put(3, "Banana");
     
     System.out.println("Itereting Hashmap");
     for(Entry m:hp.entrySet()) {
    	 System.out.println(m.getKey()+" "+m.getValue());
	}
	}
}
