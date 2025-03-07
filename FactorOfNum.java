class Factors{
    Factors(int x){
        System.out.println("Factors of the "+x+" is :");
        for (int i = 1; i <= x; i++){
            if((x % i)==0)
                System.out.print(i+", ");
        }
    }
}
public class FactorOfNum {
    public static void main(String[] args) {
        Factors f = new Factors(12);
    }
    
}
