import java.util.*;
class PrintPrime
{
	public static void main(String [] sai)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N value=");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
			
		}
		sc.close();
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}