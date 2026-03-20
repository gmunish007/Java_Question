package JavaQuestions;

@FunctionalInterface
interface myFunctionalInterface{
    void show();
    default void defShow(){
        System.out.println("print defshow");
    }
}

class display implements myFunctionalInterface{
    @Override
    public void show(){
        System.out.println("print show");
    }
}

public class Functional_Interface {
    public static void main(String[] args){
        myFunctionalInterface obj = new display();
        obj.show();
        obj.defShow();
    }
}
