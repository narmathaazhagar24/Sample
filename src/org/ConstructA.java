package org;

public class ConstructA {

public ConstructA() {
		this(9500783183L);
		System.out.println("Emp Details");
	}

	public ConstructA(String name) {
		System.out.println("Emp name is:" + name);
	}

	public ConstructA(int age) {
		this("Narmatha");
		System.out.println("Emp age is:" + age);
	}

	public ConstructA(long mobNum) {
		this(25);
		System.out.println("Emp moblie number :" + mobNum);
	}

	public static void main(String[] args) {
		ConstructA a = new ConstructA();
	}}
