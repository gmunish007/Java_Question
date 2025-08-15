// Reverse String while keeping spaces

public class StringReverse {

    public static void main(String[] args){
        String word = "hello world";
        char ch;
        String c="";

        for(int i=word.length()-1; i>=0; i--){
            ch=word.charAt(i);
            c = c+ch;
        }
        System.out.println(c);
    }
}
