class FibAndSquare {
    void printFib_and_Square(int n){
        int num = 0,num1 = 1,num2 = 0;
        for (int i = 0; i < n; i++){
            int sqr = (int) (Math.pow(2, i+1));
            System.out.print(num +", "+ sqr + ", ");
            num2 = num1;
            num1 = num;
            num = num1 + num2; 
        }
    }
}

public class MixFibAndSquare {
    public static void main(String[] args) {
        FibAndSquare fs = new FibAndSquare();
        fs.printFib_and_Square(10);
    }
}
