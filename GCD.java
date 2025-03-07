import java.util.Scanner;

class CalcGCD{
    CalcGCD(int x,int y) {
        int res = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if ((x % i == 0) && (y % i == 0)){
                res = i;
            }
        }
        System.out.println("GCD of " + x +" and " + y + " is " + res);
    }
}

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number X :");
        int x = scn.nextInt();
        System.out.println("Enter number Y :");
        int y = scn.nextInt();
        scn.close();

        CalcGCD gcd = new CalcGCD(x,y);

    }
}
