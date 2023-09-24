package Mini_Project_XO_Game;

import java.util.ArrayList;
import java.util.Arrays;

public class XOTable {
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String playerX;
    private String playerO;
    private String toPlay;
    private ArrayList<String> fields;

    public XOTable() {
        this.fields = new ArrayList<>(Arrays.asList(field1, field2, field3, field4, field5, field6, field7, field8, field9));
    }

    public void startTheGame() {
        for (int i = 0; i < this.fields.size(); i++) {
            this.fields.set(i, " ");
        }
        this.toPlay = "X";
    }

    public void print() {
        for (int i = 0; i < this.fields.size(); i++) {
            if (i == 2 || i == 5 || i == 8) {
                System.out.println(this.fields.get(i));
            } else {
                System.out.print(this.fields.get(i) + " | ");
            }
        }
        System.out.println("Player X: " + this.playerX);
        System.out.println("Player O: " + this.playerO);
    }

    public boolean isFieldEmpty(int move) {
        for (int i = 0; i < this.fields.size(); i++) {
            if (this.fields.get(move - 1).equals(" ")) {
                return true;
            }
        }
        return false;
    }

    public void switchPlayer() {
        if (this.toPlay.equals("X")) {
            this.toPlay = "O";
        } else if (this.toPlay.equals("O")) {
            this.toPlay = "X";
        }
    }

    public void makeMove(int move) {
        for (int i = 0; i < this.fields.size(); i++) {
            this.fields.set(move - 1, this.toPlay);
        }
    }

    public boolean fullTable() {
        for (int i = 0; i < this.fields.size(); i++) {
            if (this.fields.get(i).equals(" ")) {
                return false;
            }
        }
        return true;
    }

    public boolean winnerX() {
        if (this.fields.get(0).equals("X") && this.fields.get(1).equals("X") && this.fields.get(2).equals("X") ||
                this.fields.get(3).equals("X") && this.fields.get(4).equals("X") && this.fields.get(5).equals("X") ||
                this.fields.get(6).equals("X") && this.fields.get(7).equals("X") && this.fields.get(8).equals("X") ||
                this.fields.get(0).equals("X") && this.fields.get(3).equals("X") && this.fields.get(6).equals("X") ||
                this.fields.get(1).equals("X") && this.fields.get(4).equals("X") && this.fields.get(7).equals("X") ||
                this.fields.get(2).equals("X") && this.fields.get(5).equals("X") && this.fields.get(8).equals("X") ||
                this.fields.get(0).equals("X") && this.fields.get(4).equals("X") && this.fields.get(8).equals("X") ||
                this.fields.get(2).equals("X") && this.fields.get(4).equals("X") && this.fields.get(6).equals("X")) {
            return true;
        }
        return false;
    }
    public boolean winnerO() {
        if (this.fields.get(0).equals("O") && this.fields.get(1).equals("O") && this.fields.get(2).equals("O") ||
                this.fields.get(3).equals("O") && this.fields.get(4).equals("O") && this.fields.get(5).equals("O") ||
                this.fields.get(6).equals("O") && this.fields.get(7).equals("O") && this.fields.get(8).equals("O") ||
                this.fields.get(0).equals("O") && this.fields.get(3).equals("O") && this.fields.get(6).equals("O") ||
                this.fields.get(1).equals("O") && this.fields.get(4).equals("O") && this.fields.get(7).equals("O") ||
                this.fields.get(2).equals("O") && this.fields.get(5).equals("O") && this.fields.get(8).equals("O") ||
                this.fields.get(0).equals("O") && this.fields.get(4).equals("O") && this.fields.get(8).equals("O") ||
                this.fields.get(2).equals("O") && this.fields.get(4).equals("O") && this.fields.get(6).equals("O")) {
            return true;
        }
        return false;
    }

    public String getPlayerX() {
        return playerX;
    }

    public void setPlayerX(String playerX) {
        this.playerX = playerX;
    }

    public String getPlayerO() {
        return playerO;
    }

    public void setPlayerO(String playerO) {
        this.playerO = playerO;
    }

    public String getToPlay() {
        return toPlay;
    }
}

