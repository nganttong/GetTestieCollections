package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }

    @Test
    public void TestArrayDequeRemoveFirst(){
        //given
        Deque<Person> deque = new ArrayDeque<>();
        Person expected = testPersonOne;
        deque.addLast(testPersonOne);
        deque.addLast(testPersonTwo);
        //when
        Person actual = deque.removeFirst();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestArrayDequeRemoveLast(){
        //given
        Deque<Person> deque = new ArrayDeque<>();
        Person expected = testPersonTwo;
        deque.addLast(testPersonOne);
        deque.addLast(testPersonTwo);
        //when
        Person actual = deque.removeLast();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestArrayDequeAddFirst(){
        //given
        Deque<Person> deque = new ArrayDeque<>();
        Person expected = testPersonOne;
        //when
        deque.addFirst(testPersonOne);
        Person actual = deque.getFirst();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestArrayDequeAddLast(){
        //given
        Deque<Person> deque = new ArrayDeque<>();
        Person expected = testPersonTwo;
        //when
        deque.addFirst(testPersonOne);
        deque.addLast(testPersonTwo);
        Person actual = deque.getLast();
        //then
        Assert.assertEquals(expected,actual);
    }

}
