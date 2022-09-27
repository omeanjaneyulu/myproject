package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> it=new ArrayList<Integer>();
      it.add(11);
      it.add(22);
      it.add(33);
      Iterator itr= it.iterator();
      while(itr.hasNext())
      System.out.println(itr.next());
     
	}

}
