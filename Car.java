package lesson4classes;

public class Car {

	String model;
	String color;
	Motor motor;
	Wheel[] wheel;
	boolean isFull;

	public Car(String model, String color, Wheel[] wheel) {
		this.model = model;
		this.color = color;
		this.wheel = wheel;

	}


	public void refuel() {
		isFull = true;

	}

	public void changeWheel(double pressure) {
		for (int i = 0; i < wheel.length; i++) {
			if(wheel[i].pressure <= 2) {
				this.wheel[i] = new Wheel(pressure);
			}
		}
	}

	public void printCar(Car car) {
		//System.out.println(car.model + "  " + car.color + "  " + car.wheel.pressure + "  " + car.isFull);
		System.out.println(car.model + "  " + car.color + "  " + car.isFull);
	}
}
