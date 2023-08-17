import java.util.Scanner;

public class SlotMac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playStatus = null;
        long transaction = 0;
        long gain = 0;
        long loss = 0;

        while (!"EXIT".equals(playStatus)) {
            System.out.println("Choose your Lottery Number(\'From 0 to 9\')");
            int user = in.nextInt();
            System.out.println("How much would you like to DOUBLE???");
            long amount = in.nextLong();
            double slotNum = Math.random() * 10;
            int slotNum1 = (int) Math.round(slotNum);
            if (user == 12) {
                System.out.println("BINGO BINGO BINGO");
                System.out.println("YOU'VE WON " + amount * 2 + " DOLLAR$$$");
                gain = gain + amount;
            } else {
                System.out.println("Maybe Today is not your Day\tTHIS TOO SHALL PASS");
                loss = loss + amount;
            }
            System.out.println("Press EXIT to stop the roll.\t" +
                    "Press any other BUTTON to PLAY AGAIN!! ");
            playStatus = in.next();
            transaction = gain - loss;
        }
        if (gain > loss) {
            System.out.println("You Won " + transaction + " Dollars today");
        } else if (loss > gain) {
           transaction= Math.abs(transaction);
            System.out.println("You LOST "+ transaction+" Dollars today.");
        }
    }
}