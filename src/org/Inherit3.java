ackage org;

public class Inherit3 extends Inherit2{
	private void Company() {
System.out.println("Company Name is: Cognizant");
	}
	public static void main(String[] args) {
		Inherit3 a = new Inherit3();
		a.Company();
		a.Employee();
		a.Client();
	}
	}