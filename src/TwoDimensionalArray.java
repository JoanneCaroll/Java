import java.util.*;

public class TwoDimensionalArray {
	public static void main(String args[])
	{
		Random rn = new Random();
		int table[][] = new int[3][4];
		int val;
		System.out.println("Table of two-dimensional array:\n");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				val = 5 + (int)(Math.random()*50); 
				table[i][j] = val;
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
