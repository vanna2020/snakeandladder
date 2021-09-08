public class SnakeAndLadder{

    public static void main(String[] args) {

                int playerposition = 0;
                System.out.println("The start position of player is : " + playerposition);

                int diceroll = (int) (Math.random() * 6) + 1;
                playerposition += diceroll;
                System.out.println("After the roll dice....The position of player is : " + playerposition);
    }
}
