package Mini_Project_XO_Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        XOTable table = new XOTable();

        Scanner s = new Scanner(System.in);
        System.out.print("Please input the name of the first player (X): ");
        String nameX = s.next();
        System.out.print("Please input the name of the second player (O): ");
        String nameO = s.next();

        table.setPlayerX(nameX);
        table.setPlayerO(nameO);

        table.startTheGame();

        boolean hasWinner = false;
        while (!hasWinner && !table.fullTable()) {
            table.print();
            System.out.println("It is  " + table.getToPlay() + "'s move");
            System.out.print("PLayer " + table.getToPlay() + ", please make your move: ");
            int move = s.nextInt();
            if (!table.isFieldEmpty(move)) {
                System.out.println("That move is illegal. Please, make a legal move");
            } else {
                table.makeMove(move);
                table.switchPlayer();
            }
            if (table.winnerX() || table.winnerO() || table.fullTable()) {
                hasWinner = true;
            }
        }
        table.print();
        if (table.winnerX()) {
            System.out.println("Congratulations! The winner is " + nameX);
            System.out.println("Well played, " + nameX + "!");
        } else if (table.winnerO()) {
            System.out.println("Congratulations! The winner is " + nameO);
            System.out.println("Well played, " + nameO + "!");
        } else {
            System.out.println("It's a draw.");
        }
    }
}
