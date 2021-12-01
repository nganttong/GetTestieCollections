package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }

    @Test
    public void testHashSetAdd() {
        //given
        Set<Person> testSet = new HashSet<>();
        //when
        boolean actual = testSet.add(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHashSetContain() {
        //given
        Set<Person> testSet = new HashSet<>();
        //when
        testSet.add(testPersonTwo);
        boolean actual = testSet.contains(testPersonTwo);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHashSetRemove() {
        //given
        Set<Person> testSet = new HashSet<>();
        testSet.add(testPersonOne);
        //when
        boolean actual = testSet.remove(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHashSetIsEmpty() {
        //given
        Set<Person> testSet = new HashSet<>();
        //when
        boolean actual = testSet.isEmpty();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHashSetIsNotEmpty() {
        //given
        Set<Person> testSet = new HashSet<>();
        testSet.add(testPersonOne);
        //when
        boolean actual = testSet.isEmpty();
        //then
        Assert.assertFalse(actual);
    }
}
