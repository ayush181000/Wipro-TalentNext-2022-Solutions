// 3
public class CLIArgsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("No values");
			return;
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
