package Arrays;

// print all unique characters from string

public class unique_characters {
    public static void main(String[] args) {
        String str = "helloworkd";
        for(int i=0; i<str.length(); i++){
            int flag=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(str.charAt(i));
            }
        }
    }
}
