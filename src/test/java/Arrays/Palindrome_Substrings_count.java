package Arrays;

//count all palindrome substring in a given string
//aba: a,b,a,aba

public class Palindrome_Substrings_count {

    public static boolean check(String str){
        int strLen = str.length();

        for(int i=0; i<strLen/2; i++){
            if(str.charAt(i) != str.charAt(strLen-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        String str="aba";
        int count=0;

        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                String newStr = str.substring(i, j+1);
                if(check(newStr)){
                    count++;
                }
            }
        }
        System.out.println("Count: "+count);
    }
}