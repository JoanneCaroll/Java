
public class BubbleSort {
	public static void main(String args[])
	{
		int numbers[] = new int[10];
		int a, b, t, size=10;
		
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
		
		System.out.println("The original array is:\n");
		for(a=0; a<size; a++)
		{
			System.out.print(numbers[a]+" ");
		}
		
		
		for(a=1; a<size; a++)
		{
			for(b=size-1; b>=a; b--)
			{
				if (numbers[b-1] > numbers[b])
				{
					t = numbers[b-1];
					numbers[b-1] = numbers[b];
					numbers[b] = t;
				}
			}
		}
		System.out.println("The sorted array is: \n");
		for(a=0; a<size; a++)
		{
			System.out.print(numbers[a]+" ");
		}
		
	}
}
