package com.company;
import java.util.Random;
public class Main {

    public static final int No_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;

    public static void main(String[] args) {

        int playerposition = 0;
        int dice = 0;
        System.out.println("The start position of player is : " + playerposition);
        System.out.println();
        Random ranval = new Random();
        while (playerposition != 100) {
            dice++;
            int diceroll = ranval.nextInt(6) + 1;
            int check_play = ranval.nextInt(3);
            switch (check_play) {
                case No_Play:
                    System.out.println("The player at : " + playerposition + " position");
                    break;
                case Ladder:
                    playerposition += diceroll;
                    if (playerposition > 100)
                        playerposition -= diceroll;
                    System.out.println("The player at : " + playerposition + " position");
                    break;
                case Snake:
                    playerposition -= diceroll;
                    if (playerposition < 0)
                        playerposition = 0;
                    System.out.println("The player at : " + playerposition + " position");
                    break;
            }
        }
        System.out.println("The dice was played " + dice + " times to win");

    }
}



