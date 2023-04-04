package com.edu;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		int n1=2,n2=4,n3=5;
		int k=(n1>n2)?n1:n2;
		System.out.println("larger between n1 and n2==="+k);
		int j=(n1>n2 && n1>n3)? n1:(n2>n1 && n2>n3)? n2:n3;
		System.out.println("larger between n1 and n2 and n3 ==="+j);

	}

}
