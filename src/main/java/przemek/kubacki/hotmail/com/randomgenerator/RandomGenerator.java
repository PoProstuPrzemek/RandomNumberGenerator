package przemek.kubacki.hotmail.com.randomgenerator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PoProstuPrzemek
 */
public class RandomGenerator {

    private int firstNumberOfRangeInt, secondNumberOfRangeInt;

    private float firstNumberOfRangeFloat, secondNumberOfRangeFloat;

    private double firstNumberOfRangeDouble, secondNumberOfRangeDouble;

    public int getFirstNumberOfRangeInt() {
        return firstNumberOfRangeInt;
    }

    public int getSecondNumberOfRangeInt() {
        return secondNumberOfRangeInt;
    }

    public void setFirstNumberOfRangeInt(int firstNumberOfRangeInt) {
        this.firstNumberOfRangeInt = firstNumberOfRangeInt;
    }

    public void setSecondNumberOfRangeInt(int secondNumberOfRangeInt) {
        this.secondNumberOfRangeInt = secondNumberOfRangeInt;
    }

    // Main method
    public static void main(String[] args) {

        RandomGenerator randGen = new RandomGenerator();

        randGen.askForNumbers();
        randGen.randomFromRange(randGen.getFirstNumberOfRangeInt(), randGen.getSecondNumberOfRangeInt());
    }

    private void askForNumbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first number of interval: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Type the second number of interval: ");
        int secondNumber = scanner.nextInt();

        setFirstNumberOfRangeInt(firstNumber);
        setSecondNumberOfRangeInt(secondNumber);

        System.out.print("\n");
        System.out.println("firstNumberInt: " + firstNumber);
        System.out.println("secondNumberInt: " + secondNumber);
        System.out.print("\n");
    }

    // nasza najważniejsza metoda, zwracająca nam liczbę z przedziału
    private void randomFromRange(int beginningOfRange, int lastOfRange) {

        Random random = new Random();

        int returnedRange;
        returnedRange = rangeOfInterval(beginningOfRange, lastOfRange);

        int randomNumber = 0;

        //problem z - i +
        if (beginningOfRange < 0) {
            randomNumber = random.nextInt(returnedRange) + beginningOfRange;
        } else {
            randomNumber = random.nextInt(returnedRange) - beginningOfRange;
        }

        System.out.println("Generated random number is: " + randomNumber);
    }

    /**
     * This method returns a range of interval
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
}
