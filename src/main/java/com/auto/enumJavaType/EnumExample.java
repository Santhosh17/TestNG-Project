package com.auto.enumJavaType;

enum Months {// we can declare enum outside the class 
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}
public class EnumExample {
	public enum Days {// enum inside the class
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
	public static void main(String[] args) {
		System.out.println(Mobile.APPLE);
		System.out.println(Days.FRIDAY);
	}
}
