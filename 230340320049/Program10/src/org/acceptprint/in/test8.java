package org.acceptprint.in;
import java.util.Scanner;

class Program10{
	static Scanner sc=new Scanner(System.in);
	private static void acceptrecord(int  arr[]) {
		if ( arr != null )
		{
			for(int index=0;index<arr.length;index++) {
				System.out.println("Enter elemnt:");
					 arr[index]=sc.nextInt();
			
			}
		}
	}
	
	
	  private void printrecord() { 
		  if (arr != null) 
		  {
		  for(int index=0;index<arr.length;index++)
		  { 
			  System.out.println(arr[index]);
			  } } } 
	 
	  
	  }
	 
class test8{
	public static void main(String[] args) {
		Program10.acceptRecord();
		/*
		 * Program10 p=new Program10(); p.Program10();
		 */
	}
	
}
}
