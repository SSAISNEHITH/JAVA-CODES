import java.util.*;
class SumOfNnumbers{
public static void main(String [] sai){
Scanner sc = new Scanner(System.in);
System.out.print("Enter N value->");
int n = sc.nextInt();
int sum = (n*(n+1))/2;
if(n <=0 )
{
	System.out.println("The given N value is not a natural number");
}
else{
System.out.println("Sum of First N("+n+") natural numbers is "+sum);
}
}
}