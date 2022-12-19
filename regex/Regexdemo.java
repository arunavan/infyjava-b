package com.infosys;

import java.util.regex.Pattern;

public class Regexdemo {

	public static void main(String[] args) {
		String reg="Infosys";
		String input="Infosys";
		System.out.println(input.matches(reg));
		System.out.println(Pattern.matches(reg,input));
		String nameRegex = "([\\w]+)";  
		System.out.println("Ramesh99_".matches(nameRegex));
		String r2="([\\d]{10})";
		System.out.println("Mobile validation:"+ "989878675786".matches(r2));
		String emailIdRegex = "([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
		System.out.println("Ram02_AA1@4gmail.com".matches(emailIdRegex));
		String r1="([S]?[M]+[9]{3,5})";
		System.out.println("SMMM99999".matches(r1));
			String r3 = "([A-Z]{2}[-])([\\d]{9}[:])([A-Z]{2})";
			String s2="EK-860619645:IN";
		System.out.println(s2.matches(r3));
		String searchStr = "A%$lication";
		String regexStr = "A..lication";
		System.out.println(searchStr.matches(regexStr)); 
		String searchStr1 = "X8Y";
		String regexStr1 = "X[4-7]Y";
		System.out.println(searchStr1.matches(regexStr1));  
		String searchStr2 = "Hellabcdqwsertyzxjhuioklpmnhgb";
		String regexStr2 = "(Hell|Fell).*";
		System.out.println(searchStr2.matches(regexStr2));   
		String searchStr3 = "Airline";
		String regexStr3 = "Air\\s.*";
		System.out.println(searchStr3.matches(regexStr3)); 
		String regex4 = ".*(dog).*";
		String demoStr4 = " Bowser was my  fdgfd dog gfdgfdgdfgfdgfd ";
		System.out.println(demoStr4.matches(regex4));
		String passCodeRegex5 = ".*(\\d)\\1+.*";
		String passCodeStr5 = "245254";
		System.out.println(passCodeStr5.matches(passCodeRegex5));
	}

}
