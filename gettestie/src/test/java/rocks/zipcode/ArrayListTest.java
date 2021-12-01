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
        List<Person> arrayList = new ArrayList<>();
        //when
        boolean actual = arrayList.add(testPersonOne);
        //then
        Assert.assertTrue(actual);
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

    @Test
    public void testArrayListAddIndex() {
        //given
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(testPersonOne);
        //when
        arrayList.add(0, testPersonTwo);
        //then
        Assert.assertEquals(testPersonTwo, arrayList.get(0));
    }

    @Test
    public void testArrayListAddAll() {
        //given
        List<Person> arrayListOne = new ArrayList<>();
        List<Person> arrayListTwo = new ArrayList<>();
        arrayListTwo.add(testPersonOne);
        arrayListTwo.add(testPersonTwo);
        //when
        arrayListOne.addAll(arrayListTwo);
        //then
        Assert.assertEquals(arrayListOne, arrayListTwo);
    }

    @Test
    public void testArrayListRemove() {
        //given
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(testPersonOne);
        //when
        boolean actual = arrayList.remove(testPersonOne);
        Assert.assertTrue(actual);
    }

    @Test
    public void testArrayListRemoveIndex(){
        //given
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(testPersonOne);
        //when
        Person actual = arrayList.remove(0);
        //then
        Assert.assertEquals(testPersonOne, actual);
    }

    @Test
    public void testArrayListClear() {
        //given
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(testPersonOne);
        arrayList.add(testPersonTwo);
        //when
        arrayList.clear();
        //then
        Assert.assertTrue(arrayList.isEmpty());
    }
}
