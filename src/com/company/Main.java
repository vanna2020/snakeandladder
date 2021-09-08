package com.company;
import java.util.Random;
public class Main {

        public static final int No_Play = 0;
        public static final int Ladder = 1;
        public static final int Snake = 2;

        public static void main(String[] args) {

            int playerposition = 0;
            System.out.println("The start position of player is : " + playerposition);
            System.out.println();
            Random ranval = new Random();
            while (playerposition != 100) {
                int diceroll = ranval.nextInt(6) + 1;
                int check_play = ranval.nextInt(3);
                switch (check_play) {
                    case No_Play:
                        break;
                    case Ladder:
                        playerposition += diceroll;
                        if (playerposition > 100) {
                            playerposition -= diceroll;
                        }
                        break;
                    case Snake:
                        playerposition -= diceroll;
                        if (playerposition < 0) {
                            playerposition = 0;
                        }
                        break;
                }
                System.out.println("New position is= " + playerposition);
            }
            System.out.println("Player at position " + playerposition + " and also winner");

        }
    }



