package com.infosys;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
public class Regexdemo1 {
	public static void main(String[] args) {
		String regex = "InfyUser";
		String input = "InfyUser";
		System.out.println(input.matches(regex));
		System.out.println(Pattern.matches(regex, input));
		String s="InfyUser-Chennai-India-US";
		String sa[]=s.split("-");
		for(String s1:sa)
			System.out.println(s1);
		System.out.println();
		
		StringTokenizer st=new StringTokenizer(s,"-");
		
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String nameRegex = "([\\w]+)";   //A-Za-z0-9_    //? . + *   {}   
		//Regular Expression for Email Id Validation:
		String emailIdRegex = "([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
		String mobileRegex="([\\D]{10})";
		System.out.println("AMas98_".matches(nameRegex));
		String email="ram23-acd@gmail.com";
		System.out.println(email.matches(emailIdRegex));
		System.out.println("9490002334".matches(mobileRegex));
		String finalRegexPatternComplete = "([A-Z]{2}[-])([\\d]{9}[:])([A-Z]{2})";
		String input1="EX-860619645:IN";
		System.out.println(input1.matches(finalRegexPatternComplete));
		String searchStr = "M0thematics";
		String regexStr = "M\\dt.*";
		System.out.println(searchStr.matches(regexStr));   
	}

}
