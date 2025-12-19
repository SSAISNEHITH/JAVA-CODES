import java.util.*;
class Print1toN{
public static void main(String [] sai)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter N value->");
int n = sc.nextInt();
int i=1;
if(n <= 1)
{
	System.out.println("Please enter n value above '1' ");
}
else{
while(i <= n)
{
	System.out.println(i);
	i++;
}
System.out.println("Here are the numbers from 1 to N("+n+")");
}
}
}