package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test
    public void cfirstTest() {

        System.out.println("This is my first test case");
    }

    @Test
    public void asecondTest() {
        System.out.println("This is my second Test");
    }

    @Test
    public void bthirdTestCase() {
        System.out.println("This is my third Test");
    }
    @BeforeMethod

    public void beforemethod(){
        System.out.println("*************** l am Precondition*****************");
    }
@AfterMethod
    public void aftermothod(){
    System.out.println("^^^^^^^^^^^^^^^^^^I am Postcondition^^^^^^^^^^^^^^^^^^^");
}


}