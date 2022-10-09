// A Class that represents use-defined exception

class MyException extends Exception {
}

// A Class that uses above MyException
public class main {
	// Driver Program
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
			throw new MyException();
		}
		catch (MyException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}
}
