// 4 a

package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{

	private boolean gps = false;
	
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

	public void gps() {
		gps = !gps;
		System.out.println(" GPS is now " + gps);
	}
	
}
