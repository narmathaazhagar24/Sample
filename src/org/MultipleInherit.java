package org;

public class MultipleInherit implements Mul1,Mul2{

	@Override
	public void CompanyInfo() {
		System.out.println("Company Location: Chennai");
	}

	@Override
	public void EmpInfo() {
		System.out.println("Employee Name: Narmatha Azhagarraj");
	}
public static void main(String[] args) {
	MultipleInherit a = new MultipleInherit();
	a.CompanyInfo();
	a.EmpInfo();
}
}
