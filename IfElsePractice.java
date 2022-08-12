import java.util.Scanner;
public class IfElsePractice {
	public static void main(String args[]) {
		int mynumber = 8;
		int mingrade = 60;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Guess my number: ");
		int number = Integer.parseInt(in.nextLine());
		if (number == mynumber) {
			System.out.println("Wow!");
		} else {
			System.out.println("Nope!");
		}
		
		System.out.println("What is your number grade: ");
		int grade = Integer.parseInt(in.nextLine());
		if (grade >= mingrade) {
			System.out.println("You passed!");
		} else {
			System.out.println("Bummer! You have to take the class again...");
		}
	}
}
