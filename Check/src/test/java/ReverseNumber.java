
public class ReverseNumber {

	
	public static void main(String args[])
	{
		
		int num=897;
		int rev=0;
		int add=0;
		
		
		while(num>0)
			{
			
			add=num%10;
			rev=rev*10+add;
			num=num/10;
			
			
			}
		
		System.out.println(rev);
		
		
	}
}
