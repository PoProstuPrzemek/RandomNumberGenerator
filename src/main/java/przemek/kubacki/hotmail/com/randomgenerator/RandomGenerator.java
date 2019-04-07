package przemek.kubacki.hotmail.com.randomgenerator;

import java.util.Random;

import przemek.kubacki.hotmail.com.randomgenerator.interfaces.RandomGeneratorInterface;

/**
 * This library is used to generate pseudorandom number in given interval, or to
 * get random boolean or certain number of characters.
 *
 * @author PoProstuPrzemek
 */
public class RandomGenerator implements RandomGeneratorInterface {

    private int firstNumberOfRangeInt, secondNumberOfRangeInt;

    private float firstNumberOfRangeFloat, secondNumberOfRangeFloat;

    private double firstNumberOfRangeDouble, secondNumberOfRangeDouble;

    private final String CHARACTERS
            = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private final char[] charArray = new char[CHARACTERS.length()];

    Random random;

    public static void main(String[] args) {
    }

    public RandomGenerator() {
    }

    /**
     * Sets first and last integer number of internal range, and sets a flag
     * to recognise type of number.
     *
     * @param firstNumberOfRangeInt
     * @param secondNumberOfRangeInt
     */
    public RandomGenerator(int firstNumberOfRangeInt, int secondNumberOfRangeInt) {

        setFirstNumberOfRangeInt(firstNumberOfRangeInt);
        setSecondNumberOfRangeInt(secondNumberOfRangeInt);
    }

    /**
     * Sets first and last float number of internal range.
     *
     * @param firstNumberOfRangeFloat
     * @param secondNumberOfRangeFloat
     */
    public RandomGenerator(float firstNumberOfRangeFloat, float secondNumberOfRangeFloat) {

        setFirstNumberOfRangeFloat(firstNumberOfRangeFloat);
        setSecondNumberOfRangeFloat(secondNumberOfRangeFloat);
    }

    /**
     * Sets first and last double number of internal range.
     *
     * @param firstNumberOfRangeDouble
     * @param secondNumberOfRangeDouble
     */
    public RandomGenerator(double firstNumberOfRangeDouble, double secondNumberOfRangeDouble) {

        setFirstNumberOfRangeDouble(firstNumberOfRangeDouble);
        setSecondNumberOfRangeDouble(secondNumberOfRangeDouble);
    }

    // Getters & Setters
    private int getFirstNumberOfRangeInt() {
        return firstNumberOfRangeInt;
    }

    private void setFirstNumberOfRangeInt(int firstNumberOfRangeInt) {
        this.firstNumberOfRangeInt = firstNumberOfRangeInt;
    }

    private int getSecondNumberOfRangeInt() {
        return secondNumberOfRangeInt;
    }

    private void setSecondNumberOfRangeInt(int secondNumberOfRangeInt) {
        this.secondNumberOfRangeInt = secondNumberOfRangeInt;
    }

    private float getFirstNumberOfRangeFloat() {
        return firstNumberOfRangeFloat;
    }

    private void setFirstNumberOfRangeFloat(float firstNumberOfRangeFloat) {
        this.firstNumberOfRangeFloat = firstNumberOfRangeFloat;
    }

    private float getSecondNumberOfRangeFloat() {
        return secondNumberOfRangeFloat;
    }

    private void setSecondNumberOfRangeFloat(float secondNumberOfRangeFloat) {
        this.secondNumberOfRangeFloat = secondNumberOfRangeFloat;
    }

    private double getFirstNumberOfRangeDouble() {
        return firstNumberOfRangeDouble;
    }

    private void setFirstNumberOfRangeDouble(double firstNumberOfRangeDouble) {
        this.firstNumberOfRangeDouble = firstNumberOfRangeDouble;
    }

    private double getSecondNumberOfRangeDouble() {
        return secondNumberOfRangeDouble;
    }

    private void setSecondNumberOfRangeDouble(double secondNumberOfRangeDouble) {
        this.secondNumberOfRangeDouble = secondNumberOfRangeDouble;
    }

    /**
     * The getRandomInt() method is used to get an integer from range given in
     * constructor.
     *
     * <p>
     * Example of usage:
     *
     * <p>
     * RandomGenerator r = new RandomGenerator(-250, 250);
     * <br>int i = r.getRandomInt();
     *
     *
     * @return Random int
     */
    @Override
    public int getRandomInt() {

        if (getFirstNumberOfRangeInt() >= getSecondNumberOfRangeInt()) {

            throw new NegativeArraySizeException("The first number can't be"
                    + " higher or equal than the second one.");
        }

        return randomFromRangeInt(getFirstNumberOfRangeInt(), getSecondNumberOfRangeInt());
    }

    /**
     * The getRandomFloat() method is used to get an double from range given in
     * constructor.
     *
     * <p>
     * Example of usage:
     *
     * <p>
     * RandomGenerator r = new RandomGenerator(103.05312f, 32566.31f);
     * <br>float f = r.getRandomFloat();
     *
     *
     * @return Random double
     */
    @Override
    public float getRandomFloat() {

        if (getFirstNumberOfRangeFloat() >= getSecondNumberOfRangeFloat()) {

            throw new NegativeArraySizeException("The first number can't be"
                    + " higher or equal than the second one.");
        }

        return randomFromRangeFloat(getFirstNumberOfRangeFloat(), getSecondNumberOfRangeFloat());
    }

    /**
     * The getRandomDouble() method is used to get an double from range given in
     * constructor.
     *
     * <p>
     * Example of usage:
     *
     * <p>
     * RandomGenerator r = new RandomGenerator(0.20091d, 566.312223123121d);
     * <br>double d = r.getRandomDouble();
     *
     *
     * @return Random float
     */
    @Override
    public double getRandomDouble() {

        if (getFirstNumberOfRangeDouble() >= getSecondNumberOfRangeDouble()) {

            throw new NegativeArraySizeException("The first number can't be"
                    + " higher or equal than the second one.");
        }

        return randomFromRangeDouble(getFirstNumberOfRangeDouble(), getSecondNumberOfRangeDouble());
    }

    /**
     * This method allows to figure random integer using counted range of interval
     * between first and last given number.
     *
     * @param beginningOfRange
     * @param lastOfRange
     * @return Generated pseudorandom int
     */
    private int randomFromRangeInt(int beginningOfRange, int lastOfRange) {

        int returnedRange;
        int randomNumber;

        random = new Random();

        returnedRange = rangeOfIntervalInt(beginningOfRange, lastOfRange);

        if (beginningOfRange != 0) {

            return randomNumber = random.nextInt(returnedRange) + beginningOfRange;
        } else {

            return randomNumber = random.nextInt(returnedRange) - beginningOfRange;
        }
    }

    /**
     * This method allows to figure random float using counted range of interval
     * between first and last given number.
     *
     * @param beginningOfRange
     * @param lastOfRange
     * @return Generated pseudorandom float
     */
    private float randomFromRangeFloat(float beginningOfRange, float lastOfRange) {

        float returnedRange;
        float randomNumber;

        random = new Random();

        returnedRange = rangeOfIntervalFloat(beginningOfRange, lastOfRange);

        if (beginningOfRange != 0.0f) {

            return randomNumber = random.nextFloat() * returnedRange + beginningOfRange;
        } else {

            return randomNumber = random.nextFloat() * returnedRange - beginningOfRange;
        }
    }

    /**
     * This method allows to figure random double using counted range of interval
     * between first and last number.
     *
     * @param beginningOfRange
     * @param lastOfRange
     * @return Generated pseudorandom double
     */
    private double randomFromRangeDouble(double beginningOfRange, double lastOfRange) {

        double returnedRange;
        double randomNumber;

        random = new Random();

        returnedRange = rangeOfIntervalDouble(beginningOfRange, lastOfRange);

        if (beginningOfRange != 0.0d) {

            return randomNumber = random.nextDouble() * returnedRange + beginningOfRange;
        } else {

            return randomNumber = random.nextDouble() * returnedRange - beginningOfRange;
        }
    }

    /**
     * This method allows to determine range of interval between the given
     * numbers.
     *
     * @param first
     * @param last
     * @return Integer range of Interval
     */
    private int rangeOfIntervalInt(int first, int last) {

        int range = (last - first) + 1;

        return range;
    }

    /**
     * This method allows to determine range of interval between the given
     * numbers.
     *
     * @param first
     * @param last
     * @return Float range of Interval
     */
    private float rangeOfIntervalFloat(float first, float last) {

        // Need to count a range of our interval (interval == przedział)
        float range = (last - first) + 0.0000001f;

        return range;
    }

    /**
     * This method allows to determine range of interval between the given
     * numbers.
     *
     * @param first
     * @param last
     * @return Double range of Interval
     */
    private double rangeOfIntervalDouble(double first, double last) {

        // Need to count a range of our interval (interval == przedział)
        double range = (last - first) + 0.000000000000001d;

        return range;
    }

    /**
     * The getBoolean() method returns true or false value. The method gets
     * pseudorandom number in range from 0 to 99, and if the choosed number is
     * even, it returns true, or returns false if choosed number is odd.
     *
     * <p>
     * Simple method use:
     *
     * <pre>
     * <code>
     * RandomGenerator r = new RandomGenerator();
     * boolean b = r.getBoolean();
     * </code>
     * </pre>
     *
     * @return True, or False
     */
    @Override
    public boolean getBoolean() {

        int choosedRandomNumber = 0;

        random = new Random();

        choosedRandomNumber = random.nextInt(100);

        if (choosedRandomNumber % 2 == 0) {

            return true;
        } else {

            return false;
        }
    }

    /**
     * This method allows to get a certain number of specified characters:
     * abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
     *
     * <p>
     * Simple method use:
     *
     * <pre>
     * <code>
     * RandomGenerator r = new RandomGenerator();
     * char[] a = new char[10];
     *
     * try {
     *      a = r.getCharacter(-5);
     * } catch (Exception ex) {
     *      System.err.println("Exception: " + ex);
     * }
     * </code>
     * </pre>
     *
     * @param numberOfChar
     * @return certain number of char
     * @throws Exception
     */
    @Override
    public char[] getCharacter(int numberOfChar) throws Exception {

        int index;

        char[] character = new char[numberOfChar];

        random = new Random();

        for (int i = 0; i < charArray.length; i++) {

            charArray[i] = CHARACTERS.charAt(i);
        }

        switch (numberOfChar) {

            case 0:

                throw new Exception("Unalbe to get 0 characters.");
            case 1:

                index = random.nextInt(charArray.length);

                character[0] = charArray[index];

                return character;
            default:

                if (numberOfChar > 1) {

                    for (int j = 0; j < character.length; j++) {

                        index = random.nextInt(charArray.length);

                        character[j] = charArray[index];
                    }

                    return character;
                } else {

                    throw new IllegalArgumentException("The given number should "
                            + "be an integer greater than zero.");
                }
        }
    }
}
