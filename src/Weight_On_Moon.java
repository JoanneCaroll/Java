import java.util.*;

public class Weight_On_Moon {
	public static void main(String args[])
	{
		double weight_on_moon, weight_on_earth;
		System.out.println("Enter weight on earth: ");
		Scanner earthweight = new Scanner(System.in);
		weight_on_earth = earthweight.nextInt();  
		weight_on_moon = weight_on_earth * 0.17;
		System.out.println("Your weight on moon is " + weight_on_moon + ".");
		
	}
}
