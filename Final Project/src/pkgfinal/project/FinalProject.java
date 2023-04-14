/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author krishnasakethkosaraju
 */

public class FinalProject {
private static TicTacBoard ticTacBoard;

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    // Create human player and AI player
    Player humanPlayer = new Player("Player 1", "X");
    AIPlayer aiPlayer = new AIPlayer("O");

    // Create game engine with players and TicTacBoard
    GameEngine gameEngine = new GameEngine(humanPlayer, aiPlayer);

    GameController gameController = new GameController(ticTacBoard);
    System.out.println("Starting game..9.");

    // Create game UI with game engine
    TicTacBoard ticTacBoard = new TicTacBoard(gameEngine, gameController);
    ticTacBoard.setVisible(true);

    // Start the game
    ticTacBoard.startGame();
        System.out.println("game...");
        

}

    
}
