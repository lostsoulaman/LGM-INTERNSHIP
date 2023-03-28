package TicTacToe_game;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {

            TicTacToeGUI ticTacToeGUI = new TicTacToeGUI();
            ticTacToeGUI.setTitle("Tic-Tac-Toe-Created_by_SENGRA");
            ticTacToeGUI.setSize(500, 500);
            ticTacToeGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ticTacToeGUI.setVisible(true);

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}




