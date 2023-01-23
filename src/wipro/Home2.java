package wipro;
//Abstraction - Interface
public class Home2 implements Home{
public static void main(String[] args) {
	Home2 a = new Home2();
	a.userName();
	a.password();
	a.id();
}

@Override
public void userName() {
	System.out.println("Narmatha");
}

@Override
public void password() {
	System.out.println("12345");

}

@Override
public void id() {
	System.out.println("asdf12");
}
}
