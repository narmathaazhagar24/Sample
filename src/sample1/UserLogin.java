package sample1;
import org.hcl.Company;
public class UserLogin {
//method
	//type the methodname and press ctrl+space bar
	private void userName() {
//type sysout and press ctrl+space bar
		System.out.println("Enter the Username");

	}
private void passWord() {
System.out.println("Enter the Password");
}
//type main and press ctrl+space bar
public static void main(String[] args) {
	//object
	//classname objname = new classname();
	UserLogin Narmatha = new UserLogin();
	//method calling
	//objname.methodname();
	Narmatha.userName();
	Narmatha.passWord();
	ClientID ab = new ClientID();
	ab.clientname();
Company bc = new Company();
	bc.companyname();
}

}