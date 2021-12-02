package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }

    @Test
    public void testLinkedListAdd() {
        //given
        Queue<Person> testLinkedList = new LinkedList<>();
        //when
        boolean actual = testLinkedList.add(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testLinkedListPeek() {
        Queue<Person> testLinkedList = new LinkedList<>();
        testLinkedList.add(testPersonOne);
        testLinkedList.add(testPersonTwo);
        Person expected = testPersonOne;
        //when
        Person actual = testLinkedList.peek();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLinkedListRemove() {
        //given
        Queue<Person> testLinkedList = new LinkedList<>();
        testLinkedList.add(testPersonOne);
        testLinkedList.add(testPersonTwo);
        Person expected = testPersonOne;
        //when
        Person actual = testLinkedList.remove();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLinkedListPoll() {
        //given
        Queue<Person> testLinkedList = new LinkedList<>();
        testLinkedList.add(testPersonOne);
        testLinkedList.add(testPersonTwo);
        Person expected = testPersonOne;
        //when
        Person actual = testLinkedList.poll();
        //then
        Assert.assertEquals(expected,actual);
    }
}
