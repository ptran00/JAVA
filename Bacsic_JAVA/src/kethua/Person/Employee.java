package kethua.Person;

public class Employee extends Person {
	private String 	employeeID;
	private float   dateWork;
	private float   salary;
	
	public Employee(String fullName, String iD, int age, String address,String employeeID, float dateWork, float salary) {
		super(fullName, iD, age, address);
		this.employeeID = employeeID;
		this.dateWork = dateWork;
		this.salary = salary;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public float getDateWork() {
		return dateWork;
	}
	public void setDateWork(float dateWork) {
		this.dateWork = dateWork;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void showInfo() {
		super.showInfo();
		String str2 = "\nEmployeeID : " + employeeID + "\nDateWork : " + dateWork + "\nSalary : " + salary;
		System.out.println(str2);
	}
	@Override
	public String toString() {
		return super.toString() + "[EmployeeID:" + employeeID + "DateWork:" + dateWork + "Salary:" + salary + "]" ;
	}

}
