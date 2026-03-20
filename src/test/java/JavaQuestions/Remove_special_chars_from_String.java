package JavaQuestions;

public class Remove_special_chars_from_String {
    public static void main(String[] args){
        String str="hell@ world";
        String newStr=str.replaceAll("[^a-zA-Z0-9\\s]", ""); //replacing any char that is not 0-9, a-z or empty space with space
        System.out.println(newStr);
    }
}
