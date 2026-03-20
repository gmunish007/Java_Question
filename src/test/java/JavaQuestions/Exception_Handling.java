package JavaQuestions;

public class Exception_Handling {
    public static void main(String[] args){
        try{
            int num = Integer.parseInt ("sum");
            System.out.println("print try");
        }
        catch(Exception e){
            System.out.println("print catch");
        }
        finally{
            System.out.println("print finally");
        }
    }
}
