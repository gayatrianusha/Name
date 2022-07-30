
public class JavaProgram3 {

	//Palindrome
	
	public static void main(String args[])
	{
		
		
		String Original="amma";
		String dupl="";
		
		for(int i=Original.length()-1;i>=0;i--)
		{
			 dupl=dupl+Original.charAt(i);
			 
		}
		
		if(dupl.equalsIgnoreCase(Original))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
}
