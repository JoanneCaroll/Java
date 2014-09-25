
public class MinMax {
	public static void main(String args[])
	{
		int numbers[] = new int[10];
		int min, max;
		
		numbers[0]=99;
		numbers[1]=-10;
		numbers[2]=100123;
		numbers[3]=18;
		numbers[4]=-978;
		numbers[5]=5623;
		numbers[6]=463;
		numbers[7]=-9;
		numbers[8]=287;
		numbers[9]=49;
		
		min = max = numbers[0];
		for (int i=1; i<10; i++)
		{
			if(numbers[i]<min) min = numbers[i];
			if(numbers[i]>max) max = numbers[i];
			
		}
		System.out.println("The max number is " + max + " And the min number is " + min);
	System.out.println("The length of the array is" + numbers.length);
	}
}
