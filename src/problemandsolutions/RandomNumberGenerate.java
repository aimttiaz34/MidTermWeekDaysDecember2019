package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {
        Random r = new Random();
        int highestNumber  = 8;
        int randomNumber = r.nextInt(highestNumber);
        System.out.println("Random Integer value from 1 to 8 :"+(randomNumber+1));

    }

}
