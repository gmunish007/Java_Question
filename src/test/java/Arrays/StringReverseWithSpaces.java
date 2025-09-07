package Arrays;
// Reverse String while keeping spaces
// reverse hello world to dlrow olleh

public class StringReverseWithSpaces {

    public static void main(String[] args){

        String word = "Hello world";
        String str =" ";
        for(int i=0; i<word.length(); i++){
            str = word.charAt(i)+str;
        }
        System.out.print(str);
    }
}
