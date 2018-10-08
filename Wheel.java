package lesson4classes;

public class Wheel {

	double radius;
	String material;
	double pressure;

	// конструктор
	public Wheel() {

	}

	public Wheel(double pressure) {
		this.pressure = pressure;
	}

	public void demageWheel() {
		this.pressure = 0;
	}
}
