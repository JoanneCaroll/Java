package sampleprograms;

public class Multiples {
	public static void main(String args[]){	
	//	int numbers[] = new int[10];
		int arraySize=0;
		int multiples[] = new int[arraySize];
		System.out.println("Multiples of 3 or 5: ");
		for(int i = 0; i <10 ; i++){			
			if(i%3 == 0 || i%5 ==0)			{
				arraySize++;
				System.out.print(i+", ");
			}
		}
	}
}
