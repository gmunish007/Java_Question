package Arrays;

public class Occurrence_of_each_character {
    public static void main(String[] args) {
        String str = "assdgfdsasAS";
        char c[] = str.toCharArray();
        boolean[] b = new boolean[str.length()];
        for (int i = 0; i < c.length; i++) {
            if(b[i]) continue;
            int count =1;
            for(int j=i+1;j<c.length; j++){
                if(c[i]==c[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println(c[i]+":"+count);
        }
    }

}
