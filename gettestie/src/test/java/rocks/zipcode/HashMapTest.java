package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Address;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
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
    public void testHashMapPut() {
        //given
        Map<Person, Address> testHashMap = new HashMap<>();
        Address expected = addressZCW;
        //when
        testHashMap.put(testPersonOne, addressZCW);
        Address actual = testHashMap.get(testPersonOne);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashMapRemove() {
        //given
        Map<Person, Address> testHashMap = new HashMap<>();
        testHashMap.put(testPersonOne, addressZCW);
        //when
        testHashMap.remove(testPersonOne);
        boolean actual = testHashMap.containsKey(testPersonOne);
        Assert.assertFalse(actual);
    }

    @Test
    public void testHashMapSize() {
        //given
        Map<Person, Address> testHashMap = new HashMap<>();
        testHashMap.put(testPersonOne, addressZCW);
        testHashMap.put(testPersonTwo, addressZCW);
        int expected = 1;
        //when
        testHashMap.remove(testPersonOne);
        int actual = testHashMap.size();
        //then
        Assert.assertEquals(expected,actual);
    }
}
