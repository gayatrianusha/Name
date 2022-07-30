
public class JavaProgram2 {
	
	public static void main(String args[])
	{
		JavaProgram2.print(1);
	}
	
	public static void print(int n)
	{
		if(n<=20)
		{
			System.out.println(n);
			JavaProgram2.print(n+1);
		}
	}
}
