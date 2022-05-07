// 3 d and 4 d

package com.automobile;

import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero he = new Hero();
		Honda ho = new Honda();
		
		he.radio();
		ho.cdplayer();
		
		
		Logan l = new Logan();
		Ford f = new Ford();
		
		l.gps();
		f.tempControl(22);
		
		
	}

}

// OUTPUT
/**
 *  Radio is now true
 * 	CD is now true
 */
