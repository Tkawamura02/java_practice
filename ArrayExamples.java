import java.util.ArrayList;
import java.util.Scanner;
public class ArrayExamples {

	public static void main(String[] args) {
		//1. Write a program to sum all the values of a given Array in Java.
		Scanner in = new Scanner(System.in);
		int given_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for (int i : given_array) 
			sum+= i;
		System.out.println("The sum is " + sum);
		//2. What is the output?
		double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
             }
        }
        System.out.println("The output for this is: " + index);
        
        System.out.println("What integer size would you like? ");
	    int size = in.nextInt();
	    System.out.println("To what power would you like? ");
	    int power = in.nextInt();
	    
        toPower(size, power);
        in.close();
	}
	
	static void toPower(int a, int b) {
		//3. Write a public static method called "toPower" that takes in as 
        //parameters two integers called size and power. The method should return 
        //an array of size "size" with each array index raised to the value of "power." 
        //So, for example, if we passed in "size = 4" and "power = 2" to the 
        //"toPower," the method should return the following result: [0,1,4,9].
		ArrayList<Integer> start = new ArrayList<Integer>();
		for (int i = 0; i<a; i++) {
			start.add(i);
		}
		ArrayList<Integer> end = new ArrayList<Integer>();
		for (int i = 0; i<a; i++) {
			end.add((int)Math.pow(start.get(i), b));
		}
		for (int i = 0; i < end.size();i++) 
	    { 		      
	        System.out.println(end.get(i)); 		
	    }   
	}

}
