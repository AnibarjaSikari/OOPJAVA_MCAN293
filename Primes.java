class GeneratePrime{
    boolean isPrime(int x){
        if ((x == 0) || (x ==1)){
            return false;
        }
        for(int i = 2; i<x;i++){
            if((x % i)==0){
                return false;
            }
        }
        return true;
    }

    void Primes(int n){
        for (int i=0; i<n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

public class Primes {
    public static void main(String[] args) {
        GeneratePrime p = new GeneratePrime();
        p.Primes(1000);
    }
}
