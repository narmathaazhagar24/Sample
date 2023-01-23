package org.hcl;
//Method Overriding - parent class
public class Petrol {
public void petrolprice(int price1) {
System.out.println("Price of petrol on sep 20 is"+price1);
}
public static void main(String[] args) {
	Petrol P = new Petrol();
P.petrolprice(150);
}
}
