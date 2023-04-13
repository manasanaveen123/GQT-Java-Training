//Using equals ignore cases to compare the contents of the string

package com.gqt.stringproj.pkg1;

public class StringCode4 {
	public static void main(String[] args) {
		String s1="Global";
		String s2="Global";
		
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Addresses are equal");
		}
		else {
			System.out.println("Addresses are not equal");
		}
	}
}
