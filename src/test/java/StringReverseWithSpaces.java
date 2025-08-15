// Reverse String while keeping spaces

public class StringReverseWithSpaces {

    public static void main(String[] args){

        String word = "Hello world";
        String str =" ";
        char ch;
        for(int i=0; i<word.length(); i++){
            ch = word.charAt(i);
            str = ch+str;
        }
        System.out.print(str);
    }
}
