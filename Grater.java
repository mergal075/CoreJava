/*package com.edu;
import java.util.*;
public class Grater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter degree in fehreniet");
		double f=sc.nextDouble();
		double cel=((5*(f-32.0))/9.0);
		System.out.println(cel);
	}

}
*/
package com.edu;
import java.util.*;
public class Grater {

	public static void main(String[] args) {
		float rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a any number");
		int num=sc.nextInt();
		//int temp=num;
		while(num>10);
		{
			sum=sum+num;
			num=num/2;
		}
		
			System.out.println(" sum="+sum);
		
	}

}

