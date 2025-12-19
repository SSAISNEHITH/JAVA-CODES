import java.util.*;
class EvenOrOdd{
public static void main(String [] sai){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number->");
int num=sc.nextInt();
if(num % 2 == 0)
{
	System.out.println("The given number is EVEN number \t number="+num);
}
else
{
	System.out.println("The given number is ODD number \t number="+num);
}
} 
}