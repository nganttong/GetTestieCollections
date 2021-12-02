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
    public void testArrayListAdd() {
        //given
        List<Person> testArrayList = new ArrayList<>();
        //when
        boolean actual = testArrayList.add(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testArrayListSize() {
        //given
        List<Person> testArrayList = new ArrayList<>();
        int expected = 2;
        testArrayList.add(testPersonOne);
        testArrayList.add(testPersonTwo);
        //when
        int actual = testArrayList.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayListAddIndex() {
        //given
        List<Person> testArrayList = new ArrayList<>();
        testArrayList.add(testPersonOne);
        //when
        testArrayList.add(0, testPersonTwo);
        //then
        Assert.assertEquals(testPersonTwo, testArrayList.get(0));
    }

    @Test
    public void testArrayListAddAll() {
        //given
        List<Person> testArrayListOne = new ArrayList<>();
        List<Person> testArrayListTwo = new ArrayList<>();
        testArrayListTwo.add(testPersonOne);
        testArrayListTwo.add(testPersonTwo);
        //when
        testArrayListOne.addAll(testArrayListTwo);
        //then
        Assert.assertEquals(testArrayListOne, testArrayListTwo);
    }

    @Test
    public void testArrayListRemove() {
        //given
        List<Person> testArrayList = new ArrayList<>();
        testArrayList.add(testPersonOne);
        //when
        boolean actual = testArrayList.remove(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testArrayListRemoveIndex(){
        //given
        List<Person> testArrayList = new ArrayList<>();
        testArrayList.add(testPersonOne);
        //when
        Person actual = testArrayList.remove(0);
        //then
        Assert.assertEquals(testPersonOne, actual);
    }

    @Test
    public void testArrayListClear() {
        //given
        List<Person> testArrayList = new ArrayList<>();
        testArrayList.add(testPersonOne);
        testArrayList.add(testPersonTwo);
        //when
        testArrayList.clear();
        //then
        Assert.assertTrue(testArrayList.isEmpty());
    }
}
