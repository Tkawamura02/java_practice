package petClass;

import java.util.Scanner;

public class pettester {
	private String name;
	private int age;
	private String location;
	private String type;
	
	//instance method
			public void setName (String name) {
				this.name = name;
			}
			
			public void setAge (int userinput) {
				this.age = userinput;
			}
			
			public void setLocation (String location) {
				this.location = location;
			}
			
			public String getName () {
				return this.name;
			}
			
			public int getAge () {
				return this.age;
			}
			
			public String getType () {
				return this.type;
			}
			
			public String toString() {
				return "Name: " + this.name + "Age: " + this.age + "years\n" + "Location: " + this.location + "Type: " + this.type;
			}
	
	public pettester(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
			
	public pettester() {

	}
			
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		pettester ex1 = new pettester("Leo", 7, "Tempe", "Dog");
		pettester ex2 = new pettester("Shadow", 2, "Tempe", "Dog");
		pettester ex3 = new pettester("Tokyo", 2, "Tempe", "Dog");
		pettester ex4 = new pettester("Luna", 2, "Tempe", "Dog");
		
		System.out.println("Is there a specific pet you would like to learn about (1-4)? ");
		int choice = Integer.parseInt(in.nextLine());
		String userchoice = "ex" + choice;
		if (userchoice.equals("ex1")) {
			System.out.println("Name: " + ex1.getName() + "\nAge: " + ex1.getAge() + "\nType: " + ex1.getType());
		} else if (userchoice.equals("ex2")) {
			System.out.println("Name: " + ex2.getName() + "\nAge: " + ex2.getAge() + "\nType: " + ex2.getType());
		} else if (userchoice.equals("ex3")) {
			System.out.println("Name: " + ex3.getName() + "\nAge: " + ex3.getAge() + "\nType: " + ex3.getType());
		} else if (userchoice.equals("ex4")) {
			System.out.println("Name: " + ex4.getName() + "\nAge: " + ex4.getAge() + "\nType: " + ex4.getType());
		} else if (userchoice.equals("ex")) {
			//do nothing
		}
		
		System.out.println("Would you like to change or update anything? (y/n) ");
		String answer = in.nextLine();
		if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Which pet would you like to change or update? ");
            int choice1 = Integer.parseInt(in.nextLine());
            String userchoice1 = "ex" + choice1;
            System.out.println("What would you like to change or update? (Name, Age, Location, or All) ");
            String userchoice2 = in.nextLine();
            if (userchoice2.equals("All") || answer.equals("all")) {
	            System.out.println("What name would you like? ");
	            String username = in.nextLine();
	            System.out.println("What age would you like? ");
	            int userage = Integer.parseInt(in.nextLine());
	            System.out.println("What location would you like? ");
	            String userlocation = in.nextLine();
	            if (userchoice1.equals("ex1")) {
	    			ex1.setName(username);
	    			ex1.setAge(userage);
	    			ex1.setLocation(userlocation);
	    		} else if (userchoice1.equals("ex2")) {
	    			ex1.setName(username);
	    			ex1.setAge(userage);
	    			ex1.setLocation(userlocation);
	    		} else if (userchoice1.equals("ex3")) {
	    			ex1.setName(username);
	    			ex1.setAge(userage);
	    			ex1.setLocation(userlocation);
	    		} else if (userchoice1.equals("ex4")) {
	    			ex1.setName(username);
	    			ex1.setAge(userage);
	    			ex1.setLocation(userlocation);
	    		} else if (userchoice1.equals("ex")) {
	    			//do nothing
	    		}
            } else {
            	System.out.println("Type the new text here: (Name, Age, or Location) ");
            	String userinput = in.nextLine();
            	if (userchoice2.equals("Name") || userchoice2.equals("name")) {
            		if (userchoice1.equals("ex1")) {
    	    			ex1.setName(userinput);
    	    		} else if (userchoice1.equals("ex2")) {
    	    			ex1.setName(userinput);
    	    		} else if (userchoice1.equals("ex3")) {
    	    			ex1.setName(userinput);
    	    		} else if (userchoice1.equals("ex4")) {
    	    			ex1.setName(userinput);
    	    		} else if (userchoice1.equals("ex")) {
    	    			//do nothing
    	    		}
	    		} else if (userchoice2.equals("Age") || userchoice2.equals("age")) {
	    			int nuserinput = Integer.parseInt(userinput);
	    			if (userchoice1.equals("ex1")) {
    	    			ex1.setAge(nuserinput);
    	    		} else if (userchoice1.equals("ex2")) {
    	    			ex1.setAge(nuserinput);
    	    		} else if (userchoice1.equals("ex3")) {
    	    			ex1.setAge(nuserinput);
    	    		} else if (userchoice1.equals("ex4")) {
    	    			ex1.setAge(nuserinput);
    	    		} else if (userchoice1.equals("ex")) {
    	    			//do nothing
    	    		}
	    		} else if (userchoice2.equals("Location") || userchoice2.equals("location")) {
	    			if (userchoice1.equals("ex1")) {
    	    			ex1.setLocation(userinput);
    	    		} else if (userchoice1.equals("ex2")) {
    	    			ex1.setLocation(userinput);
    	    		} else if (userchoice1.equals("ex3")) {
    	    			ex1.setLocation(userinput);
    	    		} else if (userchoice1.equals("ex4")) {
    	    			ex1.setLocation(userinput);
    	    		} else if (userchoice1.equals("ex")) {
    	    			//do nothing
    	    		}
	    		}
            	System.out.println("Thank you for the update! Would you like me to print the new update? (y/n) ");
            	String answer1 = in.nextLine();
            	//update needs to be updated, not sure what I did wrong here
            	if (answer1.equals("yes") || answer1.equals("y")) {
            		if (userchoice1.equals("ex1")) {
            			System.out.println("Name: " + ex1.getName() + "\nAge: " + ex1.getAge() + "\nType: " + ex1.getType());
            		} else if (userchoice1.equals("ex2")) {
            			System.out.println("Name: " + ex2.getName() + "\nAge: " + ex2.getAge() + "\nType: " + ex2.getType());
            		} else if (userchoice1.equals("ex3")) {
            			System.out.println("Name: " + ex3.getName() + "\nAge: " + ex3.getAge() + "\nType: " + ex3.getType());
            		} else if (userchoice1.equals("ex4")) {
            			System.out.println("Name: " + ex4.getName() + "\nAge: " + ex4.getAge() + "\nType: " + ex4.getType());
            		} else if (userchoice.equals("ex")) {
            			//do nothing
            		}
            	System.out.println("Have a great day!");
            	} else {
            		System.out.println("Thank you! Have a great day.");
            	}
            }
		} else {
            System.out.println("Thank you!");
        }
		in.close();
	}
}
