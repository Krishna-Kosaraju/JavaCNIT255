/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author krishnasakethkosaraju
 */

public class GameEngine {
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private TicTacBoard ticTacBoard;


    public GameEngine(Player player1, Player player2) {
            System.out.println("Creating GameEngine object...");
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
                System.out.println("Current player: " + currentPlayer);

        } else {
            currentPlayer = player1;
                System.out.println("Current player: " + currentPlayer);

        }
    }

    public Player getCurrentPlayer() {
                return currentPlayer;
    }
    
    public Object getCurrentPlayerObject() {
    return currentPlayer;
    
}
    
    
  public void printCurrentPlayer() {
        System.out.println("P:: " + currentPlayer);
    }
    public void setTicTacBoard(TicTacBoard ticTacBoard) {
    this.ticTacBoard = ticTacBoard;
}

    public TicTacBoard getTicTacBoard() {
        return ticTacBoard;
    }
    
    public void resetGame() {
        currentPlayer = player1;
        ticTacBoard.resetBoard();
    }

    public boolean isGameOver() {
        return ticTacBoard.isGameOver();
    }
    

}

