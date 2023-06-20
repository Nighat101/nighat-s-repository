package projects.partone;

public class MethodTypes {
	public static void methodWithoutArguments() {
		System.out.println("This is a method without arguments.");
		int x = 1 + 2;
		System.out.println("This is my number: " + x);
	}
	
	public static void methodWithArguments(String entry, int y) {
		System.out.println(entry);
		System.out.println(y);
	}
	
	public static int methodWithReturn() {
		int output = 1 * 7;
		return output;
	}
	
	public static void main(String[] args) {
		methodWithoutArguments();
		methodWithArguments("This is an entry!", 5);
		methodWithReturn();
	}
}
