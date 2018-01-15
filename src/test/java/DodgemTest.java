import Rides.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Bumpin' Dodgems", 4, 110, 3.50, 67);
    }


    @Test
    public void hasName(){
        assertEquals("Bumpin' Dodgems", dodgem.getName());
    }

    @Test
    public void hasMinAge(){
        assertEquals(4, dodgem.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(110, dodgem.getMinHeight());
    }

    @Test
    public void hasPrice(){
        assertEquals(3.50, dodgem.getPrice(), 0.01);
    }

    @Test
    public void hasNumberOfCars(){
        assertEquals(67, dodgem.getNumberOfCars());
    }



}
