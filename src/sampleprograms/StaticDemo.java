package sampleprograms;
import java.util.*;

//Defines what a static class/method/variable does in the program.
class StaticClass {
	static int x = 6, y = 4;
	int count=3;
	public static void show(){
		System.out.println("Now printing from a static method");
		System.out.println("x is " + x + " and y is " + y);
	}
	static int sum(){
		int summ = x + y;
		return summ;
	}
	void setX() throws InputMismatchException{
		try {
			System.out.print("Set new value for x: ");
			Scanner newX = new Scanner(System.in);
			int a = newX.nextInt();	
			x = a;
			
		}
		catch(InputMismatchException exc){
			System.out.println("Error input for x!...");
			count--;
			System.out.println("Tries left : " + count);
			setX();
			if(equals(0)){
				System.out.println("Now terminating...");
				System.exit(0);
			}
			
		}
		
	}
	void setY() throws InputMismatchException{
		try{
			System.out.print("Set new value for y: ");
			Scanner newY = new Scanner(System.in);
			int b = newY.nextInt();	
			y = b;
		}
		catch(InputMismatchException exc){
			System.out.println("Error input for y!...");
			System.out.println("Now terminating...");
			System.exit(0);
		}
	}
}

class StaticDemo {
	public static void main(String args[]){
		System.out.println("Before program runs");
		
		StaticClass.show();
		StaticClass showstat = new StaticClass();			
		
		System.out.println("The sum of x and y is " + StaticClass.sum());
		System.out.println("The value of x is " + StaticClass.x);
	
		showstat.setX();
		System.out.println("The new value of x is "+ StaticClass.x);
		System.out.println("Program now terminating..");
			
		showstat.setY();
		System.out.println("The new value of x is "+ StaticClass.y);
		System.out.println("The new sum is " + (StaticClass.x+StaticClass.y));
			
		System.out.println("Program now terminating...");
	}	
}
