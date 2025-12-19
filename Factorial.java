import java.util.*;
class Factorial {
    public static void main(String[] sai) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value =");
        int n = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is = " + fact);
        sc.close();
    }
}