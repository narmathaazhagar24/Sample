package org;

public class EmpSal2 extends EmpSalary{
@Override
public void Salary(float sal) {
System.out.println("Salary in 2022:"+sal);
}
public static void main(String[] args) {
	EmpSal2 e = new EmpSal2();
	e.Salary(1500000f);
	EmpSalary a = new EmpSalary();
	a.Salary(100000f);
}



}
