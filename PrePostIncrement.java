package com.edu;

public class PrePostIncrement {

	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		int i=a++ + ++a; //5+7=12
		System.out.println(i);
		System.out.println("a="+a);
		
		int j=b++ +b++;  //7+8=15
		System.out.println(j);
		System.out.println("b="+b);
		System.out.println("b="+b++);//9
		System.out.println(++b);//10+1
		
		int c=10;
		int k;
		k=++c;
		System.out.println("k="+k);
		System.out.println("c="+c);
		
	}

}
