package petClass;

public class car {
	
	private String name; 
	private String make; 
	private String model; 
	
	public car() {
		
	}
	
	public car(String name, String make) {
		this.name = name; 
		this.make = make;
	}
	
	public car(String name, String make, String model) {
		this.name = name; 
		this.make = make;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean isLoud() {
		return true; 
	}
	
	public String sound() {
		return "Vroomm Vrooom!!";
	}
	
	public String makeSound(String list) {
		//there is now a variable called list, that exists in this code
		return list;
		
	}
	
	public static void main(String[] args) {
		car car1 = new car("Car1", "Mercedes-Benz", "A-Class");
		System.out.println("CAR #1  Make: " + car1.getMake() + " Model: " + car1.getModel() );
		System.out.println(car1.makeSound("Vroom!"));
	}
	


}