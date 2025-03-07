
class Generate{
    Generate(int num){
        int count = 0;
        while(count < 5){
            int random=(int)(Math.random()*num);
            System.out.print(random+"  ");
            count++;
        }
    }
}

public class RandomNum{
    public static void main(String[] args){
        Generate gen =new Generate(100);
    }
}