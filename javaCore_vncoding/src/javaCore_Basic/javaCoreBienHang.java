package javaCore_Basic;

public class javaCoreBienHang {

	public static void main(String[] args) 
	{
		int Age = 31;
		String Name = "Phong";
		boolean MaritalStatus = false;
		String Job = null;
		int Weighs = 77;
		char NameBegins = 'P';
		
		System.out.format("My name is %s\n", Name);
		System.out.format("I'm %s years old\n", Age);
		if(MaritalStatus == false)
		{
			System.out.print("I'm married\n");
		}else {
			System.out.print("I'm single\n");
		}
		System.out.format("I'm %s\n", Job);
		System.out.format("weighs %d kg\n", Weighs);
		System.out.format("My name begins with \'%s\'\n", NameBegins);
	}

}
