// 3 b

package com.automobile.twowheeler;

import com.automobile.*;

public class Hero extends Vehicle {

	private boolean radio = false;

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "hero";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "HERO1234";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Ayush";
	}

	public int getSpeed() {
		return 100;
	}

	public void radio() {
		radio = !radio;
		System.out.println(" Radio is now " + radio);
	}

}
