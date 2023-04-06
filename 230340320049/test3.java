package org.cdac.in;

import java.util.Scanner;
public class test3 {
	private static void printRecord(int []arr) {
		Scanner sc=new Scanner(System.in);
		for(int index=0;index<arr.length;index++)
		System.out.println(arr [index]);
	}
	public static void main(String args[])
	{
		int arr1[]= {10,20,30,40,50};
		test3.printRecord(arr1);
		
		int arr2[]= {10,20,30};
		test3.printRecord(arr2);
		
		int arr3[]= {10,20,30,40,50,60,70};
		test3.printRecord(arr3);
	}
	
public static void main1(String args[])
{
	int arr[]=new int[] {10,20,30};
	for(int index=0;index<3;index++)
		System.out.println(arr[index]);
	
	
		

	
	
	
		

		
	}
	
}
