package calculator;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {
	static float total;
	private static int num1;
	private static int num2;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you have? ");
		int num = Integer.parseInt(in.nextLine());
		if (num == 1) {
			System.out.println("Please enter the number: ");
			num1 = Integer.parseInt(in.nextLine());
			System.out.println("What operation? (squareroot, sin, cosine, tangent, or factorial) ");
			String operation = in.nextLine();
			if (operation.equals("squareroot")) {squareroot(num1);}
			else if (operation.equals("sin")) {sin(num1);}
			else if (operation.equals("cosine")) {cosine(num1);}
			else if (operation.equals("tangent")) {tangent(num1);}
			else if (operation.equals("")) {}
			
		} else if (num != 1) {
			System.out.println("Please enter the first number: ");
			num1 = Integer.parseInt(in.nextLine());
			System.out.println("Please enter the second number: ");
			num2 = Integer.parseInt(in.nextLine());
			System.out.println("What operation? (add, subtract, divide, multiply, or square) ");
			String operation = in.nextLine();
			
			if (operation.equals("add")) {add(num1, num2);}
			else if (operation.equals("subtract")) {subtraction(num1, num2);}
			else if (operation.equals("divide")) {division(num1, num2);}
			else if (operation.equals("multiply")) {multiplication(num1, num2);}
			else if (operation.equals("square")) {square(num1, num2);}
			else if (operation.equals("")) {}
		}
		
		in.close();
	}
	
	public static void add(float x, float y) {
		total = x + y;
		System.out.println(total);
	}
	public static void subtraction(float x, float y) {
		total = x - y;
		System.out.println(total);
	}
	public static void multiplication(float x, float y) {
		total = x * y;
		System.out.println(total);
	}
	public static void division(float x, float y) {
		total = x / y;
		System.out.println(total);
	}
	public static void square(float x, float y) {
		total = (float) Math.pow(x, y);
		System.out.println(total);
	}
	public static void squareroot(float x) {
		total = (float) Math.sqrt(x);
		System.out.println(total);
	}
	public static void sin(float x) {
		total = (float) Math.sin(x);
		System.out.println(total);
	}
	public static void cosine(float x) {
		total = (float) Math.cos(x);
		System.out.println(total);
	}
	public static void tangent(float x) {
		total = (float) Math.tan(x);
		System.out.println(total);
	}
	public static void factorial(float x) {
        long total = 1;
        for(int i = 1; i <= x; ++i)
        {
            total *= i;
        }
        System.out.println(total);
	}
}