public class LocalVariableDemo {

	static void demo() {

		String message = "Hello";

		{
			System.out.println(message);
			int count = 10;
			System.out.println(count);
		}

		System.out.println(message);
	}

	static void otherMethod() {
	}
}