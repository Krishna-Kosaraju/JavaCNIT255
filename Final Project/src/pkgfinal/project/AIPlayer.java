/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author krishnasakethkosaraju
 */
public class AIPlayer extends Player {
    public AIPlayer(String symbol) {
        super("AI", symbol);
    }

    public int[] makeMove(pkgfinal.project.TicTacBoard board) {
        int row = (int) (Math.random() * 3);
        int col = (int) (Math.random() * 3);
        while (!board.isEmptyCell(row, col)) {
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3);
        }
        return new int[]{row, col};
    }
    
}
