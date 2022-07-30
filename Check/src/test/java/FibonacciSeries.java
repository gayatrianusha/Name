
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Fibonacci series
		
		//1 2 3 5 8 13
		
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
		
	}

}
