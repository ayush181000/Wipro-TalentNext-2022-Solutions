// 1 b testing

import testPackage.Foundation;

public class TestPackage {
	public static void main(String[] args) {

		Foundation f = new Foundation();

		// not visible cause its private
//		System.out.println(f.var1);

		// not visible because its default and visible under package only
//		System.out.println(f.var2);

		// visible cause its public
		System.out.println(f.var3);

		// not visible for protected
//		System.out.println(f.var4);
	}
}
