package wipro;
//Abstraction - Partial
public class ClientInfo extends DataLogin{
public static void main(String[] args) {
	ClientInfo C = new ClientInfo();
	C.userName();
	C.password();
C.id();
}
@Override
	void password() {
System.out.println("Azhagarraj@24");		
	}
@Override
	public void userName() {
System.out.println("Nammu");
}
@Override
	void id() {
System.out.println("2036944");		
	}
}
