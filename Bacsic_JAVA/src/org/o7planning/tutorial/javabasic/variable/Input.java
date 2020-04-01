package org.o7planning.tutorial.javabasic.variable;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a Interger : ");
		int a = sc.nextInt();
		double db = sc.nextDouble();
	
		

		System.out.print("int: " + a + "\ndouble： " + db );
		sc.close();
	}

}
