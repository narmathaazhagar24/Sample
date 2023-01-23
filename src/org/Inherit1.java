package org;

public class Inherit1 {

	private void Prodname(String name) {
System.out.println("Product Title:"+name);
	}
private void Price(int price) {
System.out.println("Price of the product is:"+price);
}	
public static void main(String[] args) {
	Inherit1 z = new Inherit1();
z.Prodname("Laptop");
z.Price(18000);
}


}
