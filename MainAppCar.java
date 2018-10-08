package lesson4classes;

public class MainAppCar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Wheel wheel1 = new Wheel(1.6d);
		Wheel wheel2 = new Wheel(2.2d);
		Wheel wheel3 = new Wheel(1.6d);
		Wheel wheel4 = new Wheel(2.2d);
		Wheel wheel5 = new Wheel(1.6d);
		Wheel wheel6 = new Wheel(2.2d);
		Wheel wheel7 = new Wheel(1.6d);
		Wheel wheel8 = new Wheel(2.2d);
		Wheel exstraWheel = new Wheel(2.2d);

		Wheel[] wheelArrForAudi = new Wheel[4];

		wheelArrForAudi[0] = wheel1;
		wheelArrForAudi[1] = wheel2;
		wheelArrForAudi[2] = wheel3;
		wheelArrForAudi[3] = wheel4;

		Wheel[] wheelArrForFiat = new Wheel[4];

		wheelArrForFiat[0] = wheel5;
		wheelArrForFiat[1] = wheel6;
		wheelArrForFiat[2] = wheel7;
		wheelArrForFiat[3] = wheel8;

		Car car1 = new Car("Audi", "Black", wheelArrForAudi);
		Car car2 = new Car("Fiat", "Blue", wheelArrForFiat);
		// Car car3 = new Car("Audi", "Blue", wheelArrForAudi);
		// Car car4 = new Car("Mazda", "White", wheelArrForAudi);
		// Car car5 = new Car("BMW", "Red", wheelArrForAudi);

		car2.changeWheel(2.2d);
		car1.refuel();
		car1.printCar(car1);
		car2.wheel[2].demageWheel();
		System.out.println(car1.model + " " + car1.color + " " + car1.isFull);
	}

}
