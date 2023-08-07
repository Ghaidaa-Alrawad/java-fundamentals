package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // class 01

        // Pluralize //
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println("--------------------------------");

        // Flipping Coins //
        flipNHeads(1);
        flipNHeads(1);
        flipNHeads(2);

        System.out.println("--------------------------------");

        // Command Line Clock //
        // it will keep going till you press Ctrl+c
        clock();

    }

    //why ststic??
    //cuz it belongs to the class itself

    //function pluralize
    public static String pluralize(String pluralizeWord, int count) {
        if (count == 1) {
            return pluralizeWord;
        } else {
            return pluralizeWord + "s";
        }
    }


    //function flippingCoins
    public static void flipNHeads(int n) { // n heere is for the number of consecutive heads to flip
        Random random = new Random(); // to simulate coin flips
        int consecutiveHeads = 0;
        int flips = 0;

        while (consecutiveHeads < n) {
            double coinFlip = random.nextDouble();
            if (coinFlip >= 0.5) {
                System.out.println("heads");
                consecutiveHeads++;
            } else {
                System.out.println("tails");
                consecutiveHeads = 0;
            }
            flips++;
        }

        System.out.println("It took " + flips + " flips to flip " + n + " head" + (n > 1 ? "s" : "") + " in a row.");
    }

    //function clock
    public static void clock() {
        LocalDateTime prevTime = null;

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            if (prevTime == null || now.getSecond() != prevTime.getSecond()) {
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                prevTime = now;
            }
        }

    }
}