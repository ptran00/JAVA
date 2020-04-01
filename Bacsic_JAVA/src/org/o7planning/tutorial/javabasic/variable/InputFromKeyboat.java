package org.o7planning.tutorial.javabasic.variable;
import java.io.*;

public class InputFromKeyboat {

	public static void main(String[] args)  throws IOException{
		int BirthYear,BirthMon,BirthDay;
		String Name,Sex;
		System.out.println("nhap Ho ten : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Name = br.readLine();
		System.out.println("nhap gioi tinh : ");
		 Sex = br.readLine();
		System.out.println("nhap nam sinh : ");
		 String tmp1 = br.readLine();
		 BirthYear = Integer.parseInt(tmp1);
		System.out.println("nhap thang : ");
		 String tmp2 = br.readLine();
		 BirthMon = Integer.parseInt(tmp2);
	    System.out.println("nhap ngay : ");
		 String tmp3 = br.readLine();
		 BirthDay = Integer.parseInt(tmp3);
	
		System.out.println("Thông tin học sinh : " + Name + " Gioi tinh :" + Sex + "-" + " Nam sinh : " + BirthYear + "-" + BirthMon + "-" + BirthDay  );
		

		 
		 
	}

}
