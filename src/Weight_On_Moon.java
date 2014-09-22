import java.util.*;

public class Weight_On_Moon {
	public static void main(String args[])
	{
		double weight_on_moon_kg, weight_on_earth_kg;
		System.out.println("Enter weight on earth: ");
		Scanner earthweight = new Scanner(System.in);
		weight_on_earth_kg = earthweight.nextInt();
		weight_on_moon_kg = weight_on_earth_kg * 0.17;
		System.out.println("Your weight on moon is " + weight_on_moon_kg + ".");
		
	}
}
