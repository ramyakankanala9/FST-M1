package Activites;

public class Car {

	String color,transmission;
	int make,tyres,doors;
	Car()
	{
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics()
	{
		System.out.println("Color of the Car: "+color);
		System.out.println("transmission of the Car: "+transmission);
		System.out.println("make of the Car: "+make);
		System.out.println("tyres of the Car: "+tyres);
		System.out.println("doors of the Car: "+doors);
		
	}
	public void accelerate() {
		System.out.println("Car is moving forward.");
	    }
		
	    public void brake() {
		System.out.println("Car has stopped.");
	    }
}

