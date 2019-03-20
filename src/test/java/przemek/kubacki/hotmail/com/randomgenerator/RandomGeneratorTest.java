package przemek.kubacki.hotmail.com.randomgenerator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Przemek
 */
@DisplayName("RandomGenerator class tests.")
public class RandomGeneratorTest {

    RandomGenerator rGen;

    @BeforeAll
    public void printBeforeAll() {
        System.out.println("Start test");
    }

    @AfterAll
    public void printAfterAll() {
        System.out.println("Finish test");
    }

    @BeforeEach
    public void init() {
        rGen = new RandomGenerator();
    }
}
