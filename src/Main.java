import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 100.0;
        double bet;
        double payout;
        String[] row;
        String playagain;

        Scanner sc = new Scanner(System.in);

        System.out.println("***** WELCOME TO THE GAMBLING GAME  *****");
        System.out.println("Symbols: \uD83C\uDF4C  \uD83C\uDF7A  \uD83C\uDFAD  \uD83D\uDC8E  ✴\uFE0F");
        System.out.println("******************************************");

        while (balance > 0.0) {
            System.out.println("Current balance : " + String.format("%.2f", balance));
            System.out.print("Enter the bet amount: ");
            bet = sc.nextDouble();
            sc.nextLine();
            if (bet > balance) {
                System.out.println("Insufficient funds");
                System.out.println("BYE BYE");
                break;
            } else if (bet <= 0) {
                System.out.println("Bet should be greater than 0");
            } else if(bet <= balance ) {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            System.out.println("******************************************");
            printRow(row);
            payout = getPayout(row, bet);


            if (payout > 0.0) {
                System.out.println("You won $ " + payout);
                balance += payout;
            } else {
                System.out.println("You lost, TRY AGAIN");
            }
            System.out.println("******************************************");


            System.out.print("Do you want to play again? (Y/N) : ");
            playagain = sc.nextLine().toUpperCase();

            if (playagain.equals("N")) {
                System.out.println("OK byeeee");
                break;
            }
            else if (playagain.equals("Y")&& balance<=0) {
                System.out.println("No money to bet");
                break;
            }
        }
        sc.close();
    }

    public static String[] spinRow() {

        String[] symbols = {"🍌", "🍺", "\uD83C\uDFAD", "\uD83D\uDC8E", "✴\uFE0F" };
        String[] row = new String[3];
        Random random = new Random();


        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row){

        System.out.println((" "+ String.join(" | ", row)));
    }

    static double getPayout(String[] row, double bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "\uD83C\uDF4C" -> bet * 3.0;
                case "\uD83C\uDF7A" -> bet * 5.0;
                case "\uD83C\uDFAD" -> bet * 10.0;
                case "\uD83D\uDC8E" -> bet * 15.0;
                case "✴\uFE0F" -> bet * 20.0;
                default -> 0.0;
            };
        }
        return 0;
    }
}