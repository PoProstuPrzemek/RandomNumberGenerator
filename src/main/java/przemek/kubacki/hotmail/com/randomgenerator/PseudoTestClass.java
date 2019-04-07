/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przemek.kubacki.hotmail.com.randomgenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Przemek
 */
public class PseudoTestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RandomGenerator r = new RandomGenerator(0, 100);
        RandomGenerator r2 = new RandomGenerator(100, 610);
        RandomGenerator r3 = new RandomGenerator(-413, 1120);

        RandomGenerator dr1 = new RandomGenerator(0.0d, 5.1d);
        RandomGenerator dr2 = new RandomGenerator(-15.2d, -1.3914812623182d);
        RandomGenerator dr3 = new RandomGenerator(-103.01313512d, 566.312223123121d);

        RandomGenerator fr1 = new RandomGenerator(0.0f, 632.9301f);
        RandomGenerator fr2 = new RandomGenerator(-15.3802f, -1.392000001123f);
        RandomGenerator fr3 = new RandomGenerator(103.05312f, 32566.31f);

        int i;
        int j;
        int k;

        double d1;
        double d2;
        double d3;

        float f1;
        float f2;
        float f3;

        i = r.getRandomInt();
        j = r2.getRandomInt();
        k = r3.getRandomInt();

        d1 = dr1.getRandomDouble();
        d2 = dr2.getRandomDouble();
        d3 = dr3.getRandomDouble();

        f1 = fr1.getRandomFloat();
        f2 = fr2.getRandomFloat();
        f3 = fr3.getRandomFloat();

        System.out.println("i:" + i);

        if (i >= 0 && i <= 100) {

            System.out.println("i is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }

        System.out.println("j:" + j);

        if (j >= 100 && j <= 610) {

            System.out.println("j is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }

        System.out.println("k:" + k);

        if (k >= -413 && k <= 1120) {

            System.out.println("k is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }
/////////////////////////////////////////////////////////////////////////////////////
        System.out.println("d1: " + d1);

        if (d1 >= 0.0d && d1 <= 5.1d) {

            System.out.println("d1 is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }

        System.out.println("d2: " + d2);

        if (d2 >= -15.2d && d2 <= -1.39182d) {

            System.out.println("d2 is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }

        System.out.println("d3: " + d3);

        if (d3 >= -103.0512d && d3 <= 566.3122221d) {

            System.out.println("d3 is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }
///////////////////////////////////////////////////////////////////////////////////////
        System.out.println("f1: " + f1);

        if (f1 >= 0.0f && f1 <= 632.9301f) {

            System.out.println("f1 is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }

        System.out.println("f2: " + f2);

        if (f2 >= -15.3802f && f2 <= -1.392000001123f) {

            System.out.println("f2 is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }

        System.out.println("f3: " + f3);

        if (f3 >= 103.05312f && f3 <= 32566.31f) {

            System.out.println("f3 is in range! \n");
        } else {

            System.out.println("brbrbrbrbrbrbrbrbr");
        }
    }

    /**
     * ___________________________________TESTS_________________________________
     */
    RandomGenerator r = null;

    private void testGetBoolean() {

        r = new RandomGenerator();

        boolean b = r.getBoolean();

        int incrementator = 0;

        for (int i = 0; i < 10; i++) {

            b = r.getBoolean();

            System.out.println(b);
        }

        System.out.println("\n");
        System.out.println(b);
    }

    private void testGetCharacter() {

        r = new RandomGenerator();

        char[] aaaa = new char[20];

        try {

            aaaa = r.getCharacter(-5);
        } catch (Exception ex) {

            System.err.println("Exception: " + ex);
        }

    }

}
