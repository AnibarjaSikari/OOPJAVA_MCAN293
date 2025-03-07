class fibAndNeg {
    void printFib_and_Neg(int n){
        int num = 0,num1 = 1, minus = -1;
        for (int i = 0; i < n; i++){
            System.out.print(num +", "+ minus + ", ");
            minus -= 3;
            int num2 = num1;
            num1 = num;
            num = num1 + num2; 
        }
    }
}
public class SequenceFib1 {
    public static void main(String[] args) {
        fibAndNeg fn = new fibAndNeg();
        fn.printFib_and_Neg(10);
    }
}