package przemek.kubacki.hotmail.com.randomgenerator.interfaces;

/**
 *
 * @author Przemek
 */
public interface RandomGeneratorInterface {

    public int getRandomInt();

    public double getRandomDouble();

    public float getRandomFloat();

    public boolean getBoolean();

    public char[] getCharacter(int numberOfCharacter) throws Exception;
}
