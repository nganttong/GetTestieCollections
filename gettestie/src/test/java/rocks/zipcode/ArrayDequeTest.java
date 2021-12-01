package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Before;

public class ArrayDequeTest {
    private Person testPersonOne;
    private Person testPersonTwo;

    @Before
    public void setUp() throws Exception {
        testPersonOne = new Person("Cay", 1993);
        testPersonTwo = new Person("Trinh", 1990);
    }
}
