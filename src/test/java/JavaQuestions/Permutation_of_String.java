package JavaQuestions;

public class Permutation_of_String {
    public static void permutation(String str, String prefix){
        if(str.length()==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0; i<str.length(); i++){
                char ch=str.charAt(i);
                String remain = str.substring(0, i)+str.substring(i+1);
                permutation(remain, prefix+ch);
            }
        }
    }
    public static void main(String[] args){
        permutation("abc", "");
    }
}
