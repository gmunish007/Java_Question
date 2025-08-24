package TestNg.Annotations;

import org.testng.annotations.Test;

public class TestNgDepends {

    @Test(dependsOnMethods={"sonu", "mummy"})
    public void manu(){
        System.out.println("print manu");
    }

    @Test
    public void sonu(){
        System.out.println("print sonu");
    }

    @Test(enabled=true)
    public void mummy(){
        System.out.println("print mummy");
    }


    @Test(groups="sanity")
    public void mehar(){
        System.out.println("print mehar");
    }

    @Test(dependsOnGroups="sanity")
    public void priyanka(){
        System.out.println("print priyanka");
    }

    @Test(groups="regression")
    public void meeta(){
        System.out.println("print meeta");
    }
}
