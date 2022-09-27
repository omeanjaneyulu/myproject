package scratchDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		
		
		a.add("raju");
		a.add("nageswari");
		a.add("ome");
		
		Iterator i=a.iterator();
		while (i.hasNext())
		System.out.println(i.next());

	}

}
