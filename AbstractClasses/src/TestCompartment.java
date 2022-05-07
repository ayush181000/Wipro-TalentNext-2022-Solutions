
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compartment[] comp = new Compartment[10];

		int i = 0;
		while (i < 10) {
			int x = (int) (Math.random() * 4);
//			System.out.println(x);

			switch (x) {
			case 0:
				comp[i] = new FirstClass();
				break;
			case 1:
				comp[i] = new Ladies();
				break;
			case 2:
				comp[i] = new General();
				break;
			case 3:
				comp[i] = new Luggage();
				break;
			}

			i++;
		}

		for (int j = 0; j < comp.length; j++) {

			Compartment c = comp[j];
			System.out.println(c.notice());

		}

	}

}
