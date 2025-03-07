class SUM{

    SUM(){
        int sum = 0;
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Answer : " + sum);
    }
}

public class SumDivBy7 {
    public static void main(String[] args) {
        SUM sumObj = new SUM();
    }
}
