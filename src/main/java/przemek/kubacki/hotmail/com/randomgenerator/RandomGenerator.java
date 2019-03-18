package przemek.kubacki.hotmail.com.randomgenerator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PoProstuPrzemek
 */
public class RandomGenerator {

    private int firstNumberOfRangeInt, secondNumberOfRangeInt;
    private int numberOfRandom = 1;
//    private int numberOfRandomChar = 1;

    private float firstNumberOfRangeFloat, secondNumberOfRangeFloat;

    private double firstNumberOfRangeDouble, secondNumberOfRangeDouble;

//    private final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//    private char[] charArray = new char[CHARACTERS.length()];
    Random random;

    /**
     * The main method.
     *
     * @param args
     */
    public static void main(String[] args) {

        RandomGenerator randGen = new RandomGenerator();

        randGen.askForNumbers();
        randGen.randomFromRange(randGen.getFirstNumberOfRangeInt(), randGen.getSecondNumberOfRangeInt());
        randGen.getBoolean();
    }

    /**
     * Constructors
     */
    public RandomGenerator() {
    }

    public RandomGenerator(int firstNumberOfRangeInt, int secondNumberOfRangeInt, int numberOfRandom) {

        this.firstNumberOfRangeInt = firstNumberOfRangeInt;
        this.secondNumberOfRangeInt = secondNumberOfRangeInt;
        this.numberOfRandom = numberOfRandom;
    }

    public RandomGenerator(float firstNumberOfRangeFloat, float secondNumberOfRangeFloat, int numberOfRandom) {

        this.firstNumberOfRangeFloat = firstNumberOfRangeFloat;
        this.secondNumberOfRangeFloat = secondNumberOfRangeFloat;
        this.numberOfRandom = numberOfRandom;
    }

    public RandomGenerator(double firstNumberOfRangeDouble, double secondNumberOfRangeDouble, int numberOfRandom) {

        this.firstNumberOfRangeDouble = firstNumberOfRangeDouble;
        this.secondNumberOfRangeDouble = secondNumberOfRangeDouble;
        this.numberOfRandom = numberOfRandom;
    }

    /**
     *
     * @return
     */
    public int getFirstNumberOfRangeInt() {
        return firstNumberOfRangeInt;
    }

    public void setFirstNumberOfRangeInt(int firstNumberOfRangeInt) {
        this.firstNumberOfRangeInt = firstNumberOfRangeInt;
    }

    public int getSecondNumberOfRangeInt() {
        return secondNumberOfRangeInt;
    }

    public void setSecondNumberOfRangeInt(int secondNumberOfRangeInt) {
        this.secondNumberOfRangeInt = secondNumberOfRangeInt;
    }

    public float getFirstNumberOfRangeFloat() {
        return firstNumberOfRangeFloat;
    }

    public void setFirstNumberOfRangeFloat(float firstNumberOfRangeFloat) {
        this.firstNumberOfRangeFloat = firstNumberOfRangeFloat;
    }

    public float getSecondNumberOfRangeFloat() {
        return secondNumberOfRangeFloat;
    }

    public void setSecondNumberOfRangeFloat(float secondNumberOfRangeFloat) {
        this.secondNumberOfRangeFloat = secondNumberOfRangeFloat;
    }

    public double getFirstNumberOfRangeDouble() {
        return firstNumberOfRangeDouble;
    }

    public void setFirstNumberOfRangeDouble(double firstNumberOfRangeDouble) {
        this.firstNumberOfRangeDouble = firstNumberOfRangeDouble;
    }

    public double getSecondNumberOfRangeDouble() {
        return secondNumberOfRangeDouble;
    }

    public void setSecondNumberOfRangeDouble(double secondNumberOfRangeDouble) {
        this.secondNumberOfRangeDouble = secondNumberOfRangeDouble;
    }

    // do i need it?
    public int getNumberOfRandom() {
        return numberOfRandom;
    }

    public void setNumberOfRandom(int numberOfRandom) {
        this.numberOfRandom = numberOfRandom;
    }

    // trzeba zrobić scanner dla doubli i floatów
    private void askForNumbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first number of interval: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Type the second number of interval: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber >= secondNumber) {
            throw new NegativeArraySizeException("The first number can't be"
                    + " higher than the second one.");
        } else {

            setFirstNumberOfRangeInt(firstNumber);
            setSecondNumberOfRangeInt(secondNumber);

            System.out.print("\n");
            System.out.println("firstNumberInt: " + firstNumber);
            System.out.println("secondNumberInt: " + secondNumber);
            System.out.print("\n");
        }
    }

    /**
     * This method
     *
     * @param beginningOfRange
     * @param lastOfRange
     */
    private void randomFromRange(int beginningOfRange, int lastOfRange) {

        random = new Random();

        int returnedRange;
        int randomNumber = 0;

        returnedRange = rangeOfInterval(beginningOfRange, lastOfRange);

        if (beginningOfRange < 0) {
            randomNumber = random.nextInt(returnedRange) + beginningOfRange;
        } else {
            randomNumber = random.nextInt(returnedRange) - beginningOfRange;
        }

        System.out.println("Generated random number is: " + randomNumber);
    }

    /**
     * The method rangeOfInterval(int first, int last) returns a range of
     * interval.
     *
     * @param first
     * @param last
     * @return
     */
    private int rangeOfInterval(int first, int last) {

        // Need to count a range of our interval (interval == przedział)
        int range = (last - first) + 1;
        int rangeArray[] = new int[range];

        for (int i : rangeArray) {
            rangeArray[i] = first;
            first++;

//            System.out.println("rangeArray[i] = " + rangeArray[i]);
        }

        System.out.println("Range of the interval is: " + range);

        return range;
    }

    /**
     * spróbować coś z tablicą...
     */
    private int NumberOfRandom() {

        return 0;
    }

    /**
     * The getBoolean() method returns true or false value. The method gets
     * pseudorandom number in range from 0 to 99, and if the choosed number is
     * even, it returns true, or returns false if choosed number is odd.
     *
     * Simple method use:
     *
     * RandomGenerator r = new RandomGenerator();
     * boolean b = r.getBoolean();
     *
     * @return
     */
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
}
