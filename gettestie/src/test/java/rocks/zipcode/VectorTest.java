package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }

    @Test
    public void testVectorAdd() {
        //given
        List<Person> testVector = new Vector<>();
        //when
        boolean actual = testVector.add(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testVectorSize() {
        //given
        List<Person> testVector = new Vector<>();
        int expected = 2;
        testVector.add(testPersonOne);
        testVector.add(testPersonTwo);
        //when
        int actual = testVector.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testVectorAddIndex() {
        //given
        List<Person> testVector = new Vector<>();
        testVector.add(testPersonOne);
        //when
        testVector.add(0, testPersonTwo);
        //then
        Assert.assertEquals(testPersonTwo, testVector.get(0));
    }

    @Test
    public void testVectorAddAll() {
        //given
        List<Person> testVectorOne = new Vector<>();
        List<Person> testVectorTwo = new Vector<>();
        testVectorTwo.add(testPersonOne);
        testVectorTwo.add(testPersonTwo);
        //when
        testVectorOne.addAll(testVectorTwo);
        //then
        Assert.assertEquals(testVectorOne, testVectorTwo);
    }

    @Test
    public void testVectorRemove() {
        //given
        List<Person> testVector = new Vector<>();
        testVector.add(testPersonOne);
        //when
        boolean actual = testVector.remove(testPersonOne);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testVectorRemoveIndex(){
        //given
        List<Person> testVector = new Vector<>();
        testVector.add(testPersonOne);
        //when
        Person actual = testVector.remove(0);
        //then
        Assert.assertEquals(testPersonOne, actual);
    }

    @Test
    public void testVectorClear() {
        //given
        List<Person> textVector = new Vector<>();
        textVector.add(testPersonOne);
        textVector.add(testPersonTwo);
        //when
        textVector.clear();
        //then
        Assert.assertTrue(textVector.isEmpty());
    }
}
