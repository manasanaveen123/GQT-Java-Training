//Compare to

package com.gqt.stringproj.pkg1;

public class StringCode5 {
	public static void main(String[] args) {
		String s1="Global";
		String s2="glObAl";
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Addresses are equal");
		}
		else {
			System.out.println("Addresses are not equal");
		}
	}
}
