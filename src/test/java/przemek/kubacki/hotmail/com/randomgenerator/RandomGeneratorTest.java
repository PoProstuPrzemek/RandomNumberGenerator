package przemek.kubacki.hotmail.com.randomgenerator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Przemek
 */
public class RandomGeneratorTest {

    RandomGenerator rGen;

    @BeforeAll
    public void setup() {
        System.out.println("Start test");
    }
    
    @AfterAll
    public void down() {
        System.out.println("Finish test");
    }

    @BeforeEach
    public void init() {
        rGen = new RandomGenerator();
    }

    @Test
    public void askForNumbersTestTrueNo1() {

        int firstTestNumber = 0;
        int secondTestNumber = 100;

        rGen.setFirstNumberOfRangeInt(firstTestNumber);
        rGen.setSecondNumberOfRangeInt(secondTestNumber);

    }
}
