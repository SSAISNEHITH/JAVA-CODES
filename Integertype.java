import java.util.*;
class EvenOrOdd{
public static void main(String [] sai){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number->");
int num=sc.nextInt();
if(num > 0)
{
	System.out.println("The given number is 'Positive' \t number="+num);
}
else if(num < 0)
{
	System.out.println("The given number is 'Negative' \t number="+num);
}
else 
{
	System.out.println("The given number is 'Zero' \t number="+num);
}
} 
}