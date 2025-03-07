class PWR{
    PWR(int base,int exp){
        int result = 1;
        for (int i = 0;i < exp; i++){
            result *= base;
        }
        System.out.println(base+" to the power "+exp+" is "+result);
    }

}
public class Power {
    public static void main(String[] args) {
        PWR p = new PWR(5, 2);
    }
}
