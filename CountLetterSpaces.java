package com.edu;
import java.util.*;
public class CountLetterSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a long String");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		int ccnt=0,scnt=0,ncnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				ccnt++;
			}
			else if(Character.isSpace(ch))
			{
				scnt++;
				
			}
			else if(Character.isDigit(ch))
			{
				ncnt++;
			}
		}
		System.out.println("Space coumt="+scnt);
		System.out.println("word coumt="+ccnt);
		System.out.println("number coumt="+ncnt);
		

	}

}
