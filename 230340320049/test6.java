package org.cdac.in;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
class Program {
	private int day;
	private int month;
	private int year;

public Program() {
	LocalDate ld= LocalDate.now();
	this.day=ld.getDayOfMonth();
	this.month=ld.getMonthValue();
	this.year=ld.getYear();
	
	// TODO Auto-generated constructor stub
}

public Program(int day, int month, int year) {
	
	this.day = day;
	this.month = month;
	this.year = year;
}

@Override
public String toString() {
	return "Program [day=" + day + ", month=" + month + ", year=" + year + "]";
} class test6{
	private  int i;

	public static void main(String[] args) {
		Date[] arr=new Date[3];
		for(int i=0;i<arr.length;i++)
			arr[i]=new Date(i, i, i);
		System.out.println(arr[i].toString());
	}
}

}









