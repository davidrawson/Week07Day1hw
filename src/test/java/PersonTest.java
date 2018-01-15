import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person1;
    int age;
    int height;
    double money;

    @Before
    public void before(){
        person1 = new Person(45, 180, 24.00);
    }

    @Test
    public void hasAge(){
        assertEquals(45, person1.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(180, person1.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(24.00, person1.getMoney(), 0.01);
    }
}
