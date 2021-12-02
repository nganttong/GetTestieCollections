package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStackPop(){
        //given
        String expected = "A";
        //when
        String actual = stack.pop();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestStackPeek(){
        //given
        stack.push("D");
        String expected = "D";
        //when
        String actual = stack.peek();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestStackClear(){
        //given
        stack.push("E");
        Integer expected = 0;
        //when
        stack.clear();
        Integer actual = stack.size();
        //then
        Assert.assertEquals(expected, actual);
    }

}
