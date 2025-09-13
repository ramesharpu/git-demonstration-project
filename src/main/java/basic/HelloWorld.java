package basic;

public class HelloWorld {
	
	public void welcomeMsg() {//from d1 branch
		System.out.println("Welcome to Java Programming!");
	}
	
	//from b1 branch
	public void displayInfo() {
		System.out.println("This is a simple Java program.");
	}

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		obj.welcomeMsg();
	}

}
