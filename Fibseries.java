class Fibonacci{
    void getfibseries(int n){
        int num = 0,num1 = 1,num2 = 0, total = 0;
        for (int i = 0; i < n; i++){
            System.out.println(num);

            //swap
            num2 = num1;
            num1 = num;

            total += num;
            num = num1 + num2;
            
        }
        System.out.println("Sum of the numbers =  "+ total);
    }
}
class Fibseries{
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.getfibseries(10);
    }
}