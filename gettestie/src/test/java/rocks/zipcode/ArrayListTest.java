package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }

    @Test
    public void testArrayListSize() {
        //given
        List<Person> arrayList = new ArrayList<>();
        int expected = 2;
        arrayList.add(testPersonOne);
        arrayList.add(testPersonTwo);
        //when
        int actual = arrayList.size();
        //then
        Assert.assertEquals(expected, actual);
    }
}
