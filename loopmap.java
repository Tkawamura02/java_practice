import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
public class loopmap {

	public static void main(String[] args) {
		//program that asks user for 5 numbers and stores in array list
		//finds sum, product, largest, and smallest of list
		int sum = 0;
		int product = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		ArrayList<Integer> nlist = new ArrayList<Integer>();
		for (int i=0; i<5; i++) nlist.add(in.nextInt());
			for (int i : nlist) {
				sum+=i;
				product*=i;
			}
		System.out.println("The sum of all the numbers is: " + sum);
		System.out.println("The product of all the numbers is: " + product);
		System.out.println("The smallest number is: " + Collections.min(nlist));
		System.out.println("The biggest number is: " + Collections.max(nlist));
		
		//program that has a hash map of vehicles where model is Key and make is Value
		//ask customer model they are looking for, use hash map
		HashMap<String, String> model = new HashMap<>();
		model.put("Bronco", "Ford");
		model.put("Camry", "Toyota");
		model.put("Challenger", "Dodge");
		model.put("CLS", "Mercedes-Benz");
		
		System.out.println("What car(model) are you looking for? ");
		String request = in.next();
		System.out.println("Oh, you're looking for a " + request + "? Our " + model.get(request) + " selection is right over here...");
		
		in.close();
	}
}
