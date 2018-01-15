import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaltzerTest {

    Waltzer waltzer;
    Person person;

    @Before
    public void before(){
        waltzer = new Waltzer("Berties Waltzer", 8, 125, 4.50, 54);
        person = new Person(45,167,45.00);

    }

    @Test
    public void hasName(){
        assertEquals("Berties Waltzer", waltzer.getName());
    }

    @Test
    public void hasMinAge(){
        assertEquals(8, waltzer.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(125, waltzer.getMinHeight());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.50, waltzer.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity(){
        assertEquals(54, waltzer.getCapacity());
    }

    @Test
    public void canCheckOldEnough(){
        assertEquals(true, waltzer.checkOldEnough(person.getAge()));
    }

    @Test
    public void canCheckTallEnough(){
        assertEquals(true, waltzer.checkTallEnough(person.getHeight()));
    }

    @Test
    public void canPay(){
        assertEquals(true, waltzer.hasEnoughMoney(person.getMoney()));
    }

}
