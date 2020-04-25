package com.mytestcases;

public class Dog extends Animal {
	
	public static void main(String[] args) {
		//basic java
		Animal obj=new Animal();
		//obj.getsalary();
		//inheritance 1st
		Dog obj2 =new Dog();
		obj2.getsalary();
		//inheritance Two
				Animal obj3 =new Dog();
				obj3.getsalary();
				//inheritance Three>>>> not possible
				//Dog obj4 =new Animal();
				//obj4.getsalary();		
		
		
	}

}
