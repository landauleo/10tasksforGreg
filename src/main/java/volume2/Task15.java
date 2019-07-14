package volume2;

import java.util.Random;
import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task15 {

    public static void main(String[] args) {
        Random r = new Random();
        int min = 10;
        int max = 100;
        int randomNumber = r.nextInt((max - min) + 1) + min;
        System.out.println(randomNumber);
        System.out.println(guessNumber(randomNumber));
    }

    public static String guessNumber(int randomNumber) {
        Scanner s = new Scanner(System.in);
        int guess = s.nextInt();
        for (int attempt = 0; attempt < 8; attempt++) {
            if (guess == randomNumber) {
                return "Ты угадал, умничка";
            } else if (guess < randomNumber) {
                System.out.println("Выбери число побольше, братиш");
            } else {
                System.out.println("Выбери число поменьше, братиш");
            }
            guess = s.nextInt();
        }
        return "Ты проиграл, лол";
    }
}
