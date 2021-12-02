package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }

    @Test
    public void testTreeSetAdd() {
        //given
        Set<Person> testTreeSet = new TreeSet<>();
        //when
        boolean actual = testTreeSet.add(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTreeSetContain() {
        //given
        Set<Person> testTreeSet = new TreeSet<>();
        //when
        testTreeSet.add(testPersonTwo);
        boolean actual = testTreeSet.contains(testPersonTwo);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTreeSetRemove() {
        //given
        Set<Person> testTreeSet = new TreeSet<>();
        testTreeSet.add(testPersonOne);
        //when
        boolean actual = testTreeSet.remove(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTreeSetIsEmpty() {
        //given
        Set<Person> testTreeSet = new TreeSet<>();
        //when
        boolean actual = testTreeSet.isEmpty();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTreeSetIsNotEmpty() {
        //given
        Set<Person> testTreeSet = new TreeSet<>();
        testTreeSet.add(testPersonOne);
        //when
        boolean actual = testTreeSet.isEmpty();
        //then
        Assert.assertFalse(actual);
    }
}
