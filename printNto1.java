import java.util.*;
class PrintNto1{
public static void main(String [] sai)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter N value->");
int n = sc.nextInt();
int y=n;
int i=1;
if(n <= 1)
{
	System.out.println("Please enter n value above '1' ");
}
else{
while(n >= i)
{
	System.out.println(n);
	n--;
}
System.out.println("Here are the numbers from N("+y+") to 1");
}
}
}