class Seq{
    Seq(int x){
        float fact = 1, total = 0;
        float res = 0;
        for (int i = 1;i< x+1;i++){
            res = (float)(1/fact);
            total += res;
            System.out.print(1+"/"+fact+", ");
            fact *= i+1;
        }
        System.out.println("\nTotal of the values in the given sequence up to "+x+" terms = "+total);
    }

}
public class FactSeq {
    public static void main(String[] args) {
        Seq s1 = new Seq(5);       
    }
}
