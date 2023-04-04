package com.edu;
import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter units");
		int unit=sc.nextInt();
		double d;
		if(unit>0 && unit<100)
		{
			d=unit*2;
		}else if(unit>100 && unit<400)
		{
			d=100*2+(unit-100*3);
		}else {
			d=100*2+300*3+(unit-400*3.5);
		}
		
		System.out.println("Total Bill"+d);

	}

}
