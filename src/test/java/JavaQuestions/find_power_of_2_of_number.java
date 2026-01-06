package JavaQuestions;

public class find_power_of_2_of_number {
    public static void main(String[] args){
        int result=1, base=4, power=2;
        for(int i=0; i<power; i++){
            result=result*base;
        }
        System.out.println(result);
    }
}
