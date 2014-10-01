
import java.util.*;

class ExcTest {
	static void genTest(){
		
	}
}
class ExcDemo1 {
	public static void main(String args[]){

			
		try {
			int nums[] = new int[4];
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 4 digits from 1-5");
			for(int i = 0; i < nums.length; i++){
				System.out.println("num["+i+"]: ");
				nums[i] = scan.nextInt();
			
					
			}
		}
		catch (InputMismatchException exc)
		{
			System.out.println("Integers only!");
		}
		System.out.println("After catch statement");
	}
}
