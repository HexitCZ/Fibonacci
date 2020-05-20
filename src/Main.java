
public class Main
{

	public static void Fibonacci(int amount)
	{

		int intMinOne = 0;
		int currentInt = 1;
		int output;
		System.out.print(intMinOne + " " + currentInt + " ");

		for (int i = 2; i < amount; i++)
		{
			output = currentInt + intMinOne;

			System.out.print(output + " ");

			intMinOne = currentInt;

			currentInt = output;

		}

	}

	public static void main(String[] args)
	{
		Fibonacci(20);

	}

}
