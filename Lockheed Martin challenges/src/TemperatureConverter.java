import java.util.Scanner;

public class TemperatureConverter
	{
		static String scale;
		static int temperature, temp, again;
		static boolean Cel, Fah, again1;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput1 = new Scanner(System.in);
		public static void main(String[] args)
			{
				again1 = true;
				while (again1)
					{
						temperature();
						getScale();
						while (Fah)
							{
								convertToCel();
							}
						while (Cel)
							{
								convertToFah();
							}
						askForMore();
					}
			}
		public static void temperature()
		{
			System.out.println("Please input a temperature");
			temperature=userInput1.nextInt();
			System.out.println("Please input whether it is:");
			System.out.println("(F) Fahrenheit");
			System.out.println("(C) Celsius");
			scale = userInput.nextLine();
		}
		public static void getScale()
		{
		switch (scale)
		{
			case "F":
			case "f":
			case "Fahrenheit":
			case "fahrenheit":
					{
						System.out.println("Converting");
						System.out.println("..............");
						Fah = true;
						break;
					}
			case "C":
			case "c":
			case "Celsius":
			case "celsius":
					{
						System.out.println("Converting");
						System.out.println("..............");
						Cel = true;
						break;
					}
		}
		}
		public static void convertToCel()
		{
			temp = temperature;
			temperature = temperature-32;
			temperature = temperature*5;
			temperature = temperature /9;
			System.out.println(temp +"°F is "+temperature+"°C");
			Fah = false;
		}
		public static void convertToFah()
		{
			temp = temperature;
			temperature = temperature*9;
			temperature = temperature/5;
			temperature = temperature+32;
			System.out.println(temp + "°C is "+temperature+"°F");
			Cel = false;
		}
		public static void askForMore()
		{
			System.out.println("Would you like to play again? Please type a 1 or a 2:");
			System.out.println("(1) Yes");
			System.out.println("(2) No");
			again = userInput1.nextInt();
			if (again==1)
				{
					again1=true;
				}
			else if (again==2)
				{
					System.out.println("See you later.");
					again1=false;
				}
		}

	}
