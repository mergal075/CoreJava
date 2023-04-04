package com.edu;
import java.util.*;
public class CircleAreaPerimeter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a radius");
		Double r=sc.nextDouble();
		
		double p=2*Math.PI*r;
		double area=Math.PI*r*r;
		System.out.println("perimeter"+p);
		System.out.println("area="+area);
		

	}

}
