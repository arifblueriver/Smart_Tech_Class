package com.stepdef.amazon.tv;

public class TestingMethods {
	
	void getsalary() {
		System.out.println("Hi All");
	}
		static void getmoney() {
		System.out.println("Have a Nice Day");	
	}
		int getincome() {
			return 20;
		}
public static void main(String[] args) {
	TestingMethods obj=new TestingMethods();
	//obj.getsalary();
	//TestingMethods.getmoney();
	//obj.getincome();
	
	//if method static than call in to main method classname.obj name 
	int a=obj.getincome();// first way declare new variable@ same data type
	//int a=obj.getincome(); Then syso(a)
	System.out.println(a);
	System.out.println(obj.getincome()); 
	//2nd way use syso (obj.methods())
}
}
