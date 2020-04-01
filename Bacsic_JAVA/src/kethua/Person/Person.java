package kethua.Person;

public class Person {
	private String fullName;
	private String ID;
	private int age;
	private String address;
	
	 public Person() {
		
	}
	 
	public Person(String fullName, String iD, int age, String address) {
		this.fullName = fullName;
		this.ID = iD;
		this.age = age;
		this.address = address;
	}

	public String getFullName() {
		 return fullName;
	 }
	 public void setFullName(String fullname) {
		 this.fullName = fullname;
	 }
	 public String getID() {
		 return ID;
	 }
	 public void setID(String id) {
		 this.ID = id;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public  void showInfo() {
		String str = "Full Name : " + getFullName() + "\nIdentity Card : " + getID() + "\nAge : " 
	                + getAge() + "\nAddress : " + getAddress();
		System.out.print(str);
	}
	      @Override 
	public String toString(){
		return getClass().getName() + "[FullName:" + fullName +"/Identity card:" + ID + "/Address:"+ address;
	}
	
}
