/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author krishnasakethkosaraju
 */
public class GameController {
    private GameEngine gameEngine;
    private TicTacBoard ticTacBoard;
    private Player player1;
    private Player player2;
    
public GameController(TicTacBoard ticTacBoard) {
    System.out.println("Creating GameController object with existing TicTacBoard...");
    this.ticTacBoard = ticTacBoard;
    this.player1 = new Player("Player 1", "X");
    this.player2 = new AIPlayer("O");
    this.gameEngine = new GameEngine(player1, player2);
}
public boolean makeMove(int row, int col) {

    if (ticTacBoard == null) {
        ticTacBoard = new TicTacBoard(gameEngine, this);
    }
    if (gameEngine.getTicTacBoard() == null) {
        gameEngine.setTicTacBoard(ticTacBoard);
    }

    boolean moveMade = false;
    if (gameEngine.getTicTacBoard() != null) {
        moveMade = gameEngine.getTicTacBoard().setSymbol(row, col, gameEngine.getCurrentPlayer().getSymbol());
    }

    return moveMade;
}



    public TicTacBoard getTicTacBoard() {
        return ticTacBoard;
    }
      public GameEngine getGameEngine() {
        return gameEngine;
    }
      public Player getCurrentPlayer() {
    return gameEngine.getCurrentPlayer();
}
public boolean isCurrentPlayerAI() {
    return gameEngine.getCurrentPlayer() instanceof AIPlayer;
}


      
      
}


