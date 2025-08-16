import java.util.Arrays;

public class AnagramChecker {

    public static boolean anagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char [] charStr1 = str1.toCharArray();
        char [] charStr2 = str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        return Arrays.equals(charStr1, charStr2);
    }

    public static void main(String[] args){
        boolean value= anagram("hello", "elolh");
        System.out.println(value);
        /*if(anagram("hello", "hello")){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }*/
    }
}
