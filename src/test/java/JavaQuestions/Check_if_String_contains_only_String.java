package JavaQuestions;

public class Check_if_String_contains_only_String {
    public static boolean check(String str){
        //return str.matches("[0-9]+");

        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(check("12a"));
    }
}
