// 4 b

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		registerUser("mickey", "us");
		registerUser("mini", "india");

	}

	public static void registerUser(String username, String country) {
		try {
			if (country.toLowerCase() != "india") {
				throw new InvalidCountryException();
			}
			System.out.println("User registration successful");

		} catch (InvalidCountryException e) {
			System.out.println("exception triggered");
		}

	}
}

//Only available for India
//exception triggered
//User registration successful
