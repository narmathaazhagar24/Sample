package org;

public class Exp {
/*public static void main(String[] args) {
	System.out.println(1);
try {
	System.out.println(2/0);
}
catch(ArithmeticException e){
	System.out.println("Don't divide by zero");
}
finally {
	System.out.println(3);
}
}*/

	public static void main(String[] args)throws AgeNotFoundException{
		int age = 10;
		int afterage = age+5;
		if(afterage<18) {
			throw new AgeNotFoundException();
			
		}
	}











}

