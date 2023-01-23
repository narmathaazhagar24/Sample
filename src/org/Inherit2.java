package org;

public class Inherit2 extends Inherit1{

	public void Client() {
System.out.println("Client Name is: Walmart");
}
public static void main(String[] args) {
	Inherit2 a = new Inherit2();
	a.Employee();
	a.Client();
}
}
