import java.util.Scanner;

/*
 * 
 * @ Author Bill Wilt
 * 
 */

public class Lab8b {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int studentChoice = 0;
		int studentChoiceMinusOne = studentChoice - 1;
		String nextChoice = "";
		String yesNoContinue = "";
		boolean continueMore = false;

		String[] names = { "Beth Smith", "Jim Williams", "Sean Seas", "Kim Reynolds", "John Deere", "Fred Savage",
				"Sue Best", "Nikki Fox", "Mark Jacobs", "Carol Bells" };
		String[] hometowns = { "Detroit", "Newport", "Monroe", "Flat Rock", "Dundee", "Ida", "Adrian", "Luna Pier",
				"Erie", "Tecumseh" };
		String[] favoriteFoods = { "Hamburger", "Hot Dog", "Chicken", "Shrimp", "Fish", "Mac and Cheese", "Tacos",
				"Burrito", "Nachos", "French Fries" };
		do {
			System.out.print(
					"Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): ");
			try {
				do {
					studentChoice = keyboard.nextInt();
					studentChoice = studentChoice - 1;
					keyboard.nextLine();
					if ((studentChoice >= 0) && (studentChoice <= 9)) {
						System.out.println("Student " + (studentChoice + 1) + " is " + names[studentChoice]
								+ ". What would you like to know about " + names[studentChoice]
								+ "? (enter \"hometown\" or \"favorite food\"): ");
						
						nextChoice = keyboard.nextLine();

					} else if ((studentChoice > 1) || (studentChoice > 10)) {
						System.out.println("That student does not exist... Please try again. (enter a number 1-10): ");
					}
				} while ((studentChoice < 1) || (studentChoice > 10));
			} catch (Exception e) {
				System.out.print("That student does not exist. Please try again.... (enter a number 1-10): ");
			}

			if (nextChoice.toLowerCase().equals("hometown")) {
				System.out.println(names[studentChoice] + " is from " + hometowns[studentChoice]
						+ ". Would you like to know more? (enter \"yes\" or \"no\"): ");
				yesNoContinue = keyboard.next();
				yesNoContinue(yesNoContinue);
			} else if (nextChoice.toLowerCase().equals("favorite food")) {
				System.out.println(names[studentChoice] + "'s favorite food is " + favoriteFoods[studentChoice]
						+ ". Would you like to know more? (enter \"yes\" or \"no\"): ");
				yesNoContinue = keyboard.next();
				yesNoContinue(yesNoContinue);
			} else {
				System.out.println(
						"That data does not exist.  Please try again. (enter \"hometown\" or \"favorite food\"):");
			}
		} while (yesNoContinue(yesNoContinue) == true);

		System.out.println("Goodbye.");
		keyboard.close();
	}

	public static boolean yesNoContinue(String yesNoContinue) {
		boolean continueMore;
		if (yesNoContinue.toLowerCase().equals("yes")) {
			continueMore = true;
			return continueMore;
		} else {
			continueMore = false;
			return continueMore;
		}
	}
}
