package com.edu;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("with using third variable num1="+num1+"\nNum2="+num2);
		/*
		System.out.println("**************Without third variable***************");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("with using third variable num1="+num1+"\nNum2="+num2);
		*/
	}

}
