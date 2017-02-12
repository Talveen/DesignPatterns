package com.wintal.pattern.factory;

public class CarFactory {
	
	public Car getCar(String carName){
		if(carName == null)
			return null;
		else if(carName.equals("Mercedes"))
			return new Mercedes();
		else if(carName.equals("Ford"))
			return new Ford();
		else if(carName.equals("Chevrolet"))
			return new Chevrolet();
		return null;
	}

}
