package javaCore_Basic;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen : ");
		int a = sc.nextInt();
		System.out.println("Nhap so Thuc Float : ");
		float b = sc.nextFloat();
		System.out.println("Nhap so Thuc Double : ");
		double c = sc.nextDouble();
		@SuppressWarnings("unused")
		String as = sc.nextLine();
		System.out.println("Nhap vao 1 chuoi string : ");
		String d = sc.nextLine();
		System.out.println("So nguyen: " + a + "\nso thuc Float: " + b + "\nSo thuc Double: " + c + "\nChuoi: " + d);

		
		sc.close();
		
	}


}
