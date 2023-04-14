/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author krishnasakethkosaraju
 */

package pkgfinal.project;
import javax.swing.*;




public class TicTacBoard extends javax.swing.JFrame {

    
    private enum Player {
        X, O
    }
    
    private GameController gameController;
    private GameEngine gameEngine;
    private Player currentPlayer;
    private JButton[][] board;
    private boolean gameOver;


    public TicTacBoard(GameEngine gameEngine, GameController gameController) {
        this.gameEngine = gameEngine;
        this.gameController = gameController;
        this.board = new JButton[3][3];
        
          initComponents();
          startGame();
    }
    
    private void printCurrentPlayer() {
    System.out.println("Current player after switch: " + currentPlayer);
}

    
    /**
     * Creates new form TicTacBoard
     */
   
    public void startGame() {
    currentPlayer = Player.X;
    board = new JButton[3][3];
    board[0][0] = jButton1;
    board[0][1] = jButton2;
    board[0][2] = jButton4;
    board[1][0] = jButton7;
    board[1][1] = jButton5;
    board[1][2] = jButton6;
    board[2][0] = jButton8;
    board[2][1] = jButton9;
    board[2][2] = jButton3;

  for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            JButton cell = board[i][j];
            if (cell != null) {
                cell.setText("");
                cell.putClientProperty("row", i);
                cell.putClientProperty("col", j);
                cell.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        tictactoebuttonpressed(evt);
                    }
                });
            }
        }
          System.out.println("Starting game34r...");
          
    }

}
    public void resetGame() {
        startGame();
        gameEngine.resetGame();
    }

    public void updateDisplay(String message) {
        display2.setText(message);
    }

public void updateBoard(TicTacBoard tictacboard) {
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            board[row][col].setText(tictacboard.getSymbol(row, col));
        }
    }
}
    private void switchPlayer() {
        currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
    }
     public int getRow(JButton cell) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == cell) {
                    return row;
                }
            }
        }
        return -1;
    }
    private int getCol(JButton cell) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == cell) {
                    return col;
                }
            }
        }
        return -1;
        //gameController.getCurrentPlayer().getSymbol()
    }
    public boolean isGameOver()
{
    return gameController.getGameEngine().getTicTacBoard().hasWinner("X") || 
    gameController.getGameEngine().getTicTacBoard().hasWinner("O")  || gameController.getGameEngine().getTicTacBoard().isFull();
}
    
    public void resetBoard() {
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            board[row][col].setText("");
        }
    }
    gameOver = false;
    
}
public boolean setSymbol(int row, int col, String symbol) {
    if (board[row][col].getText().equals("")) {
        board[row][col].setText(symbol);
        return true;
    } else {
        return false;
    }
}
public String getSymbol(int row, int col) {
    return board[row][col].getText();
}

public void makeMove(int row, int col) {
    gameController.makeMove(row, col);
}
public boolean hasWinner(String symbol) {
    // Check rows for a win
    while (symbol.equals("X")|| symbol.equals("O"))
    {
       for (int i = 0; i < 3; i++) {
        if (board[i][0].getText().equals(symbol) && board[i][1].getText().equals(symbol) && board[i][2].getText().equals(symbol)) {
            System.out.println(symbol);
            System.out.println("True"); //Issue with the above if-statement, indexs might be wrong not sure?
            return true;
            
        }
    }
    // Check columns for a win
    for (int i = 0; i < 3; i++) {
        if (board[0][i].getText().equals(symbol) && board[1][i].getText().equals(symbol) && board[2][i].getText().equals(symbol)) {
            System.out.println(symbol);
            System.out.println("True C");
            return true;
        }
    }
    // Check diagonals for a win
    if (board[0][0].getText().equals(symbol) && board[1][1].getText().equals(symbol) && board[2][2].getText().equals(symbol)) {
                    
        System.out.println(symbol);
           
        System.out.println("True D");

        return true;
    }
    if (board[2][0].getText().equals(symbol) && board[1][1].getText().equals(symbol) && board[0][2].getText().equals(symbol)) {
                   
        System.out.println("True E");
    System.out.println(symbol);
        return true;
    }
    
} 

    return false; 
    }
    

public void displayWinner(String playerName) {
    JOptionPane.showMessageDialog(this, "Congratulations " + playerName + ", you won!");
}

public boolean isFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j].getText().equals("")) {
                return false;
            }
        }
    }
    return true;
}

public void displayTie() {
    JOptionPane.showMessageDialog(this, "It's a tie!");
}
private void showMessageDialog(String message) {
    JOptionPane.showMessageDialog(this, message);
}
public boolean isEmptyCell(int row, int col) {
    return board[row][col].getText().equals("");
}






    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        quit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display2.setEditable(false);
        display2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setMargin(new java.awt.Insets(15, 15, 15, 15));
        getContentPane().add(display2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tictactoebuttonpressed(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jMenu1.add(quit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu2.add(About);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
    int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);
    if (dialogResult == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_quitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
    JOptionPane.showMessageDialog(this, "Tic-Tac-Toe Game\nVersion 1.9.1\n\nThis program was created by Krishnasaketh Kosaraju as a project for CNIT 255.");
    }//GEN-LAST:event_AboutActionPerformed

    private void tictactoebuttonpressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tictactoebuttonpressed
    JButton button = (JButton) evt.getSource();
    int row = (int) button.getClientProperty("row");
    int col = (int) button.getClientProperty("col");
    
    if (gameController.makeMove(row, col)) {
        button.setText(gameController.getCurrentPlayer().getSymbol());
        gameEngine.printCurrentPlayer();


        if (gameController.getGameEngine().isGameOver()) //Check condition and its method to see if winner is being declared right
        { 
            System.out.println("Game is over");//Runs
            
            if (gameController.getGameEngine().getTicTacBoard().hasWinner("O")) 
            {  
                updateDisplay("Computer wins!");
            } 
            
            else if (gameController.getGameEngine().getTicTacBoard().hasWinner(gameController.getCurrentPlayer().getSymbol()))
                    {
                     showMessageDialog(gameController.getCurrentPlayer().getName() + " wins!");
                     System.out.println("Current player won"); //Runs almost everytime 

                    }
            
            else if (isFull())
            
            {
                showMessageDialog("It's a tie!");
            }
            

        } 
               
        else 
        {
            gameEngine.printCurrentPlayer();
            gameEngine.switchPlayer();
            gameEngine.printCurrentPlayer();
                  
            // System.out.println(gameController.getCurrentPlayer().getSymbol()); //Not Running at all, bug with gameController.getCurrentPlayer(), specifically because it is Player it doesn't work with AIplayer
            // button.setText(gameController.getCurrentPlayer().getSymbol());

            if (gameEngine.getCurrentPlayerObject() instanceof AIPlayer) 
            {
                gameEngine.printCurrentPlayer();
                
                    AIPlayer aiPlayer = (AIPlayer) gameEngine.getCurrentPlayerObject();
                    int[] aiMove = aiPlayer.makeMove(gameController.getGameEngine().getTicTacBoard());
                
                if (gameController.makeMove(aiMove[0], aiMove[1])) {
                    JButton aiButton = board[aiMove[0]][aiMove[1]];
                    aiButton.setText("O");
                    
                    if (gameController.getGameEngine().isGameOver())
                    {
                         if (gameController.getGameEngine().getTicTacBoard().hasWinner("O")) 
                            {  
                                updateDisplay("Computer wins!");
                            } 
            
                        else if (gameController.getGameEngine().getTicTacBoard().hasWinner(gameController.getCurrentPlayer().getSymbol()))
                            {
                             showMessageDialog(gameController.getCurrentPlayer().getName() + " wins!");

                            }
            
                        else if (isFull())

                            {
                                showMessageDialog("It's a tie!");
                            }
                    }
                    
                    else 
                    {
                        gameEngine.switchPlayer();
                        button.setText(gameController.getCurrentPlayer().getSymbol());
                    }
                    
                }
            }
        }
    }
        
        
    
        
    }//GEN-LAST:event_tictactoebuttonpressed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JTextField display2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem quit;
    // End of variables declaration//GEN-END:variables

    
}
