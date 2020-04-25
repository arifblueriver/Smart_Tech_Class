package com.stepdef.amazon.tv;

public class GenericCodeOne {
	//String name;
//int a;
//public GenericCodeOne(String name) {
	//this.name=name;
	//}
//public GenericCodeOne(int a) {
	//this.a=a;
//}

	
//void getsalary() {
	//System.out.println(name);
	//System.out.println("Hi All");
//}
int a =10;
int b =20;
int c;

void getsalary () {
	System.out.println("This is a value::"+a);
	System.out.println("This is b:: +b");
	
}
int getmoney(int a,int b) {
	this.a=a;
	this.b=b;
	c= a+b;
	return c ;
}
public static void main(String[] args) {
	GenericCodeOne obj=new GenericCodeOne();
	obj.getmoney(5,10);
	System.out.println(	obj.getmoney(5,10)
);
}


	
	
}
