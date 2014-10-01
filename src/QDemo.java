
public class QDemo {
		public static void main(String args[])
		{
			Queue1 bigQ = new Queue1(100);
			Queue1 smallQ = new Queue1(4);
			char ch;
			int i;
			
			System.out.println("Using bigQ to store the alphabet.");
			for(i=0; i<26; i++)
				bigQ.put((char)('A'+i));
			System.out.print("Contents of bigQ");
			for(i=0; i<26; i++)
			{
				ch = bigQ.get();
				if (ch!= (char)0) System.out.print(ch);
			}
			System.out.println("\n");
			System.out.println("Using smallQ to generate errors.");
			for (i=0; i<5; i++)
			{
				System.out.print("Attempting to store "+(char)('Z'-i));
				System.out.println();
			}
			System.out.println();
			System.out.print("Contents of small Q");
			for (i=0; i<5; i++)
			{
				ch = smallQ.get();
				if (ch != (char) 0)
					System.out.print(ch);
			}
		}
		
	}

class Queue1 
{
	char q[];
	int putloc, getloc;
	
	Queue1 (int size)
	{
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	void put (char ch)
	{
		if (putloc == q.length-1)
		{
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	char get() 
	{
		if(getloc == putloc)
		{
			System.out.println(" - Queue is empty");
			return (char)0;
		}
		getloc++;
		return q[getloc];
	}
	
}
