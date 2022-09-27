package com.array;

import java.util.Arrays;

public class ArrayShortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[] arr = new short[] { 35, 25, 18, 45, 77, 21, 3 };
	      System.out.println("Unsorted:");
	      for (short s : arr) {
	         System.out.println(s);
	      }
	      System.out.println("Sorted:");
	      Arrays.sort(arr);
	      for (short s : arr) {
	         System.out.println(s);
	      }
	      System.out.println();
	}

}
