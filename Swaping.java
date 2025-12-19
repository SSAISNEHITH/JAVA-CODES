import java.util.*;
class Swaping{
public static void main(String []  sai){
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers->");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("---before Swapping--- \n num1=" +num1 +"\n num2=" +num2);
int temp = num1;
num1 = num2;
num2 = temp;
System.out.println("---After Swapping--- \n num1=" +num1 +"\n num2=" +num2);
}
}