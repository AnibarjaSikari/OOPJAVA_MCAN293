class SequencePrint{
    void printSeq(int n){
        int n1,n2=1;
        for (int  i = 1; i < n; i++){
            n1 = (2*i);
            System.out.print(n1+", "+n2+", ");
            n2 = (n2*(i+1));

        }
    }
}

public class SequenceType2 {
    public static void main(String[] args) {
        SequencePrint sp = new SequencePrint();
        sp.printSeq(10);
    }
}
