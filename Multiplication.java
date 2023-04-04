package com.edu;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a multiplication");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(""+num+"X"+i+"="+num*i);
		}
		
	}

}
