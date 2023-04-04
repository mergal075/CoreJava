package com.edu;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String s=sb.toString();
		System.out.println(s);
		}

}
