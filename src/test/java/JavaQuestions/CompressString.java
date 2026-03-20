package JavaQuestions;

public class CompressString {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        int count=1;
        char c=str.charAt(0);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }
            else{
                sb.append(c).append(count);
                c=str.charAt(i);
                count=1;
            }
        }
        sb.append(c).append(count);
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(compress("aaabbc"));
    }
}
