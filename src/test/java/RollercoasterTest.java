import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Reginalds Screamin' Rollercoaster", 14, 140, 8.00, 260);
    }


    @Test
    public void hasName(){
        assertEquals("Reginalds Screamin' Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void hasMinAge(){
        assertEquals(14, rollercoaster.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(140, rollercoaster.getMinHeight());
    }

    @Test
    public void hasPrice(){
        assertEquals(8.00, rollercoaster.getPrice(), 0.01);
    }

    @Test
    public void hasMaxHeight(){
        assertEquals(260, rollercoaster.getMaxHeight());
    }

}
