package lab01Package;
public class ToolChoice {

	public static void main(String[] args) throws Exception {
		// A variable to keep the user's choice	
		char ideChoice;

		// The choices available
		System.out.println("What is your preferred IDE for Java development?");
		System.out.println("1 - Eclipse");
		System.out.println("2 - NetBeans");

		System.out.print("Type your selection (1 or 2) here: ");
		ideChoice = (char) System.in.read();

		if (ideChoice == '1')
			System.out.println("Good choic");
		else if (ideChoice == '2')
			System.out.println("Good choice! You a");
		else
			System.out.println("Invalid selection. Re-run the program");
	}
}
