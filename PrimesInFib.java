class PrimeAndFib{
    //generate fibseries 
    //check prime or not 
    //prime print
    //up to 8 times
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
    void primeAndFib(){
        int num = 0, num1 = 1, num2 = 0, count = 0;
        while(count < 8){
            if(isPrime(num)){
                System.out.println(num);
                count++;
            }

            num2 = num1;
            num1 = num;

            num = num1 + num2;
 
        }
    }
}

public class PrimesInFib {
    public static void main(String[] args) {
        PrimeAndFib p = new PrimeAndFib();
        p.primeAndFib();
    }    
}
