package org;

public class Employee {
	private void empId() {
System.out.println("Enter the Employee Details");
	}
private void empId(int age, String firstname) {
System.out.println("Emply age is"+age);
System.out.println("Emply firstname is"+firstname);
}
private void empId(String surname, int salary){
	System.out.println("Emply surname is"+surname);
	System.out.println("Emply salary is"+salary);
}
public static void main(String[] args) {
	Employee E = new Employee();
	E.empId();
	E.empId(25, "Gayathiri");
	E.empId("Azhagarraj",30000);
}

}
