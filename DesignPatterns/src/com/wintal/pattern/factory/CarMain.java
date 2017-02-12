package com.wintal.pattern.factory;

public class CarMain {

	public static void main(String[] args) {
		CarFactory carFactory =  new CarFactory();
		
		Car car = carFactory.getCar("Mercedes");
		car.start();
	}

}
