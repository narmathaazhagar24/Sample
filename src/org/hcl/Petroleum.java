package org.hcl;
//method overriding - childclass
public class Petroleum extends Petrol{
@Override
	public void petrolprice(int price1) {
		System.out.println("Price of petrol on sep 22 is"+price1);
}
public static void main(String[] args) {
 Petroleum a = new Petroleum();
 a.petrolprice(110);
a.petrolprice(200);
}

}
