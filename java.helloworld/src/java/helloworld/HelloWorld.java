package java.helloworld;

public class HelloWorld {
	
	private static HelloMessage helloMessage;

	public static void main(String[] args) {
		helloMessage = new HelloMessage("Hello World from refactor!");
		System.out.println(helloMessage.getMessage());
	}
}
