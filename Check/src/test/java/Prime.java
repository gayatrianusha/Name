
public class Prime {
	
	public static void main(String args[])
	{
		
		int a=20;
		boolean flag=false;
		
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				flag= true;
			}
		}
		
		if(flag)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}
}
