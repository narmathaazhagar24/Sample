package org.hcl;
//Method Overloading
public class ClientDetails {
	//no argument
public void ClientData() {
System.out.println("Enter the ClientData");
}
//datat type
private void ClientData(String name) {
	System.out.println("Client name is"+name);
}
//data type count
private void ClientData(String surName, int age) {
System.out.println("Client surname is"+surName);
System.out.println("Client age is"+age);
}
//data type order
private void ClientData(int pincode, String addr) {
	System.out.println("Client Pincode is"+pincode);
System.out.println("Client address is"+addr);
}
public static void main(String[] args) {
	ClientDetails a = new ClientDetails();
	a.ClientData();
	a.ClientData("Anupriya");
	a.ClientData("Azhagarraj", 22);
	a.ClientData(612001, "Kumbakonam");
}






}