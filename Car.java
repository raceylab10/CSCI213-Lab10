



public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	
	public Car(int intDoors, int intPassengers){
		super("Subaru", "Crosstrek", "CSTRJER");
		this.doors = intDoors;
		this.passengers = intPassengers;
	
	}
	public int getDoors() {
		return this.doors;
	}
	public int getPassengers() {
		return this.passengers;
	}
	
	
	//2-door Honda Civic with license BINARY.
	@Override
	public String toString() {
		String result = String.format("%s-door %s%s with license %s.", getDoors(), super.getMake(),super.getModel(), super.getPlate());
		return result;
	}
	
	//an equals method that returns true if the number of doors and passengers are equal, and the supers are equal.
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Car)){
			return false;
		}
		// cast other to current type
		Car otherCar = (Car) other;
		// test instance variables
		int doors1 = getDoors();
		int doors2 = otherCar.getDoors();
		int passengers1 = getPassengers();
		int passengers2 = otherCar.getPassengers();
		if (doors1 == doors2) {
			if (passengers1 == passengers2) {
				return super.equals(other);
			}
		}
		return false;
	}
	
	
	public Car copy() {
		Car carCopy = new Car(this.doors, this.passengers);
		carCopy.getMake();
		carCopy.getModel();
		carCopy.getPlate();
		return carCopy;
	  }
}