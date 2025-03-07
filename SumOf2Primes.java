class Primes{
    boolean isPrime(int x){
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    Primes(int num){
        boolean found = false;
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " is sum of " + i + " and " + (num - i));
                found = true;
            }
        }
        if (!found) {
            System.out.println(num + "is not sum of two prime numbers");
        }
    }
}

public class SumOf2Primes {
    public static void main(String[] args) {
        Primes p = new Primes(5);
    }
}
