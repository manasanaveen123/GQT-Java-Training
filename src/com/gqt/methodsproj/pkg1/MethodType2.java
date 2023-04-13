package com.gqt.methodsproj.pkg1;

class Calculator2 {
	//returntype=void(no return values)
	//parameters=contains parameters
	
	void add(int a,int b) //method with input and no output
	{
		int c=a+b;
		System.out.println(c);
	}
}

public class MethodType2 {
	public static void main(String[] args) {
		Calculator2 c2 = new Calculator2();
		c2.add(10,20);
	}

}
