package co.za.applicafro.tg;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    Student student = new Student("Liko");

    @Test
    public void testObjectEq(){
        Assert.assertEquals(student,
                student);
    }
}
