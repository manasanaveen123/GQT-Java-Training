//Different types of methods used in strings

package com.gqt.stringproj.pkg1;

public class StringCode6 {
	public static void main(String[] args) {
		String s1="MAHABHARATHA";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(5));
		//System.out.println(s1.charAt(50));
		System.out.println(s1.indexOf('B'));
		System.out.println(s1.indexOf('Z'));
		System.out.println(s1.startsWith("MAHA"));
		System.out.println(s1.startsWith("VaHa"));
		System.out.println(s1.endsWith("RATHA"));
		System.out.println(s1.endsWith("VaHa"));
		System.out.println(s1.contains("BHARATH"));
		System.out.println(s1.contains("Vharath"));
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf('A'));
	}
}
