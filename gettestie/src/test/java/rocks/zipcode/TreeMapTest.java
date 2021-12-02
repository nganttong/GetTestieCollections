package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Address;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    private Person testPersonOne;
    private Person testPersonTwo;
    private Address addressZCW;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
        addressZCW = new Address("N. Orange St", "Wilmington", "19802", "United States");
    }

    @Test
    public void testTreeMapPut() {
        //given
        Map<Person, Address> testTreeMap = new TreeMap<>();
        Address expected = addressZCW;
        //when
        testTreeMap.put(testPersonOne, addressZCW);
        Address actual = testTreeMap.get(testPersonOne);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTreeMapRemove() {
        //given
        Map<Person, Address> testTreeMap = new TreeMap<>();
        testTreeMap.put(testPersonOne, addressZCW);
        //when
        testTreeMap.remove(testPersonOne);
        boolean actual = testTreeMap.containsKey(testPersonOne);
        Assert.assertFalse(actual);
    }

    @Test
    public void testTreeMapSize() {
        //given
        Map<Person, Address> testTreeMap = new TreeMap<>();
        testTreeMap.put(testPersonOne, addressZCW);
        testTreeMap.put(testPersonTwo, addressZCW);
        int expected = 1;
        //when
        testTreeMap.remove(testPersonOne);
        int actual = testTreeMap.size();
        //then
        Assert.assertEquals(expected,actual);
    }

}
