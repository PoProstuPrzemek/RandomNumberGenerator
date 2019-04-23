package przemek.kubacki.hotmail.com.randomgenerator.interfaces;

/**
 *
 * @author Przemek
 */
public interface RandomGeneratorInterface {

    int getRandomInt();
    
    long getRandomLong();

    double getRandomDouble();

    float getRandomFloat();

    boolean getBoolean();

    char[] getCharacter(int numberOfCharacter) throws Exception;
}
