class CharPrint{
    CharPrint(){
        for (char ch = 'A'; ch <= 'Z'; ch++ ){
            System.out.print(ch+", ");
        }
    }
}

public class PrintChar {
    public static void main(String[] args) {
        CharPrint cp = new CharPrint();
    }
}
