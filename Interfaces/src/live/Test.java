// 1 d

package live;

import music.Playable;
import music.string.*;
import music.wind.*;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		
		v.play();
		s.play();
		
		Playable c = new Veena();
		Playable d = new Saxophone();
		
		c.play();
		d.play();
	}

}
