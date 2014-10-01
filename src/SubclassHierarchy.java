
class Superclass {
	Superclass(){
		System.out.println( "Superclass");
	}
}
class Subclass1 extends Superclass{
	Subclass1(){
		super();
		//System.out.println("Subclass1");
	}
		
}
class Subclass2 extends Subclass1{
	Subclass2(){
		super();
		//System.out.println("Subclass2");
	}
}

public class SubclassHierarchy {
	public static void main(String args[]){
		Subclass2 sb2 = new Subclass2();
	}
}
