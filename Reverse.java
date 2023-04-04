package com.edu;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		int rem;
		rem=num1%10;
		System.out.print(rem);
		
		num1=num1/10;
		rem=num1%10;
		System.out.print(rem);
		num1=num1/10;
		rem=num1%10;
		System.out.print(rem);
		
	}

}
