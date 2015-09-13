package za.ac.cput.ngosa;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.ngosa.config.AppConfig;
import za.ac.cput.ngosa.garageServices.Implementation.GarageInterface;

/**
 * Created by User on 2015/02/20.
 */
public class GarageTest extends TestCase {

   private ApplicationContext contxt;
    GarageInterface garage;

    @BeforeMethod
    public void setUp() throws Exception
    {
         contxt= new AnnotationConfigApplicationContext(AppConfig.class);
         garage = (GarageInterface) contxt.getBean("tesla");
    }


    @org.junit.Test
    public  void testName() throws Exception
    {

        assertEquals("huayra",garage.name("huayra"));
    }

    @org.junit.Test
    public  void testCate() throws Exception
    {
        assertEquals("hybrid", garage.category("hybrid"));
    }

    @org.junit.Test
    public  void testValue() throws Exception
    {
        assertEquals(654,garage.value(654),0);
    }

    @org.junit.Test
    public  void testBHP() throws Exception
    {
        assertEquals(544, garage.bhp(544));
    }

    @org.junit.Test
    public  void testColor() throws Exception
    {
        assertEquals("blue",garage.colour("blue"));
    }

}
