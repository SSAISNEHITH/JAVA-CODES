import java.util.*;
class Swaping{
public static void main(String []  sai){
Scanner sc=new Scanner(System.in);
System.out.print("Enter three different numbers->");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
System.out.println("num1="+num1+"\nnum2="+num2+"\nnum3="+num3);
if(num1 > num2 && num1> num3){
System.out.println("The 'MAXIMUN' number is num1 i.e, "+num1);
}
else if(num2>num1 && num2>num3){
System.out.println("The 'MAXIMUN' number is num2 i.e, "+num2);
}
else{
System.out.println("The 'MAXIMUN' number is num3 i.e, "+num3);
}
if(num1 < num2 && num1 < num3){
System.out.println("The 'MINIMUM' number is num1 i.e, "+num1);
}
else if(num2<num1 && num2<num3){
System.out.println("The 'MINIMUM' number is num2 i.e, "+num2);
}
else{
System.out.println("The 'MINIMUMN' number is num3 i.e, "+num3);
}
}
}