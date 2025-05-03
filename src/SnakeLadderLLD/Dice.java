package SnakeLadderLLD;

import java.util.Random;

public class Dice {

    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int totalSum = 0;
        int diceCounter = 0;
        while(diceCount > diceCounter) {
            totalSum += new Random().nextInt(max - min + 1) + min;
            diceCounter++;
        }
        return totalSum;
    }

}
