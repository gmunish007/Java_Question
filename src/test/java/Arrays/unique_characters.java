package Arrays;

public class unique_characters {
    public static void main(String[] args) {
        String str = "helloworkd";
        for(int i=0; i<str.length(); i++){
            int flag=1;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag=2;
                    break;
                }
            }
            if(flag==1){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
