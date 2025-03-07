import java.util.Scanner;

class Fact{
    int getFactorial(int x){
        int res = 1;
        while (x > 0){
            res = res * x;
            x-=1;
        }
        return res;
    }
}

public class Factorial {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println("Enter any number to calculate factorial: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = fact.getFactorial(n);
        System.out.println("Factorial of " + n + " = " + a);
        scn.close();
    }
}
