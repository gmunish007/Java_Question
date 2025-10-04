package JavaQuestions;

public class if_num_is_power_of_2 {
    public static boolean check(int n){
        if(n<=0) return false;

        while(n>1){
            if(n%2 !=0) return false;
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args){
        if(check(16)){
            System.out.println("power of 2.");
        }
        else{
            System.out.println("not power of 2.");
        }
    }
}
