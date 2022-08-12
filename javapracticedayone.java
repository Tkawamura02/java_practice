import java.util.Scanner;

public class javapracticedayone {
	public static void main(String[] args) {
		int ageLimit = 18;
		
		Scanner in = new Scanner(System.in);
		System.out.println("How old are you?");
			int age = Integer.parseInt(in.nextLine());
		
		if (age < ageLimit) {
			System.out.println("You are too young! Sorry!");
			System.exit(0);
		} else {
			//program continues as normal because they pass
		}
			
		System.out.println("Enter a name: ");
			String name = in.nextLine();
		System.out.println("Give me an adverb: ");
        	String adverb = in.nextLine();
        System.out.println("Give me an adjective: ");
        	String adjective = in.nextLine();
        System.out.println("Give me a noun: ");
        	String noun = in.nextLine();
        System.out.println("Give me another noun: ");
        	String nounTwo = in.nextLine();
        System.out.println("Give me a number: ");
        	String number = in.nextLine();
        System.out.println("Give me your name: ");
        	String yourName = in.nextLine();
        
        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
        
        in.close();
	}
}
