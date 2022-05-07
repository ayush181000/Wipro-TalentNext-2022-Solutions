// 3 c

package com.automobile.twowheeler;

import com.automobile.*;

public class Honda extends Vehicle{
	
	private boolean cd = false;

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "HONDA1234%";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "JohnDoe";
	}
	
	public int getSpeed() {
		return 100;
	}

	public void cdplayer() {
		cd = !cd;
		System.out.println(" CD is now " + cd);
	}

}
