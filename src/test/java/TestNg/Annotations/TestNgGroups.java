package TestNg.Annotations;

import org.testng.annotations.Test;

public class TestNgGroups {

    @Test(groups={"family1"})
    public void manu(){
        System.out.println("print manu");
    }

    @Test(groups={"family2"})
    public void mehar(){
        System.out.println("print mehar");
    }

    @Test(groups={"family1"})
    public void priyanka(){
        System.out.println("print priyanka");
    }

    @Test
    public void meeta(){
        System.out.println("print meeta");
    }

    @Test
    public void sonu(){
        System.out.println("print sonu");
    }

    @Test
    public void mummy(){
        System.out.println("print mummy");
    }
}
