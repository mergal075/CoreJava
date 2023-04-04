package com.edu;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Character");
		char ch=sc.next().charAt(0);
		if(ch=='A'||ch=='e'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='U'||ch=='u'||ch=='a'||ch=='E')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonants");
		}
	}

}
