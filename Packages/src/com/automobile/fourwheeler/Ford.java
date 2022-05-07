// 4 b

package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

	private int tempControl = 24;

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSpeed() {
		return 100;
	}

	public void tempControl(int temp) {
		tempControl = temp;
		System.out.println("The new temperature is " + tempControl);
	}

}
