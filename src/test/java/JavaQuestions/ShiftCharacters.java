package JavaQuestions;

//program for input="ace" and output: "bdf"

public class ShiftCharacters {
    public static String shiftChar(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            //char ch = str.charAt(i);

            // when you perform an arithmetic on char, it is promoted to an int.
            // (char) casting back to char
            char newChar = (char)(str.charAt(i)+1);
            sb.append(newChar);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String newStr = shiftChar("sdf");
        System.out.println(newStr);
    }
}
