package Bai;


import java.util.logging.*;

import kethua.Person.Employee;
import kethua.Person.Student;

public class Bai63_Logging   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student("Tran Hong Thuy","151716788",31,"Tokyo","14TE457",3,154,"N1",65.5f);
		Employee employee1 = new Employee("Tran Van Phong","151716788",31,"Tokyo","14TE4578",23.4f,30.0f);
		
		System.out.print(std1);
        Logger.getGlobal().info(std1.toString());
        Logger.getGlobal().info(employee1.toString());
	}

}
