/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.tictactoeproject;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author K00243015
 */
public class TicTacToe extends javax.swing.JFrame
{
    char[][] gameGrid = new char[3][3]; //3x3 GameGrid
    static int turnCounter = 0; //Turn counter
    char player = 'X'; //Starting player
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe()
    {
        initComponents();
        messageLabel.setText("Player X's Turn"); //Set text on program init()
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        squaresPanel = new javax.swing.JPanel();
        square1 = new javax.swing.JButton();
        square2 = new javax.swing.JButton();
        square3 = new javax.swing.JButton();
        square4 = new javax.swing.JButton();
        square5 = new javax.swing.JButton();
        square6 = new javax.swing.JButton();
        square7 = new javax.swing.JButton();
        square8 = new javax.swing.JButton();
        square9 = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        squaresPanel.setBackground(new java.awt.Color(255, 255, 255));
        squaresPanel.setLayout(new java.awt.GridLayout(3, 3));

        square1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square1.setFocusable(false);
        square1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square1ActionPerformed(evt);
            }
        });
        squaresPanel.add(square1);

        square2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square2.setFocusable(false);
        square2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square2ActionPerformed(evt);
            }
        });
        squaresPanel.add(square2);

        square3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square3.setFocusable(false);
        square3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square3ActionPerformed(evt);
            }
        });
        squaresPanel.add(square3);

        square4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square4.setFocusable(false);
        square4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square4ActionPerformed(evt);
            }
        });
        squaresPanel.add(square4);

        square5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square5.setFocusable(false);
        square5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square5ActionPerformed(evt);
            }
        });
        squaresPanel.add(square5);

        square6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square6.setFocusable(false);
        square6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square6ActionPerformed(evt);
            }
        });
        squaresPanel.add(square6);

        square7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square7.setFocusable(false);
        square7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square7ActionPerformed(evt);
            }
        });
        squaresPanel.add(square7);

        square8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square8.setFocusable(false);
        square8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square8ActionPerformed(evt);
            }
        });
        squaresPanel.add(square8);

        square9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        square9.setFocusable(false);
        square9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                square9ActionPerformed(evt);
            }
        });
        squaresPanel.add(square9);

        messageLabel.setBackground(new java.awt.Color(255, 255, 255));
        messageLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Player X's Turn");

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(squaresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(squaresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newGameButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void square1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square1ActionPerformed
    {//GEN-HEADEREND:event_square1ActionPerformed
        gameGrid[0][0] = player; //Put player letter in array cell selected
        square1.setEnabled(false); //disables button
        square1.setText(player+""); //Put player letter into button selected
        player = checkTurn(player); //check players turn
    }//GEN-LAST:event_square1ActionPerformed

    private void square2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square2ActionPerformed
    {//GEN-HEADEREND:event_square2ActionPerformed
        gameGrid[0][1] = player;
        square2.setEnabled(false);
        square2.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square2ActionPerformed

    private void square3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square3ActionPerformed
    {//GEN-HEADEREND:event_square3ActionPerformed
        gameGrid[0][2] = player;
        square3.setEnabled(false);
        square3.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square3ActionPerformed

    private void square4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square4ActionPerformed
    {//GEN-HEADEREND:event_square4ActionPerformed
        gameGrid[1][0] = player;
        square4.setEnabled(false);
        square4.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square4ActionPerformed

    private void square5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square5ActionPerformed
    {//GEN-HEADEREND:event_square5ActionPerformed
        gameGrid[1][1] = player;
        square5.setEnabled(false);
        square5.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square5ActionPerformed

    private void square6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square6ActionPerformed
    {//GEN-HEADEREND:event_square6ActionPerformed
        gameGrid[1][2] = player;
        square6.setEnabled(false);
        square6.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square6ActionPerformed

    private void square7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square7ActionPerformed
    {//GEN-HEADEREND:event_square7ActionPerformed
        gameGrid[2][0] = player;
        square7.setEnabled(false);
        square7.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square7ActionPerformed

    private void square8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square8ActionPerformed
    {//GEN-HEADEREND:event_square8ActionPerformed
        gameGrid[2][1] = player;
        square8.setEnabled(false);
        square8.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square8ActionPerformed

    private void square9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_square9ActionPerformed
    {//GEN-HEADEREND:event_square9ActionPerformed
        gameGrid[2][2] = player;
        square9.setEnabled(false);
        square9.setText(player+"");
        player = checkTurn(player);
    }//GEN-LAST:event_square9ActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newGameButtonActionPerformed
    {//GEN-HEADEREND:event_newGameButtonActionPerformed
        JButton[] squares = new JButton[]{square1, square2, square3, square4, square5, square6, square7, square8, square9}; //put JButtons into an array
        for (JButton square : squares) //iterate through JButtons
        {
            square.setEnabled(true);
            square.setText("");
        }
        for (int i = 0; i < gameGrid.length; i++) //set gameGrid array to null
        {
            for (int j = 0; j < gameGrid[i].length; j++)
            {
                gameGrid[i][j] = ' '; 
            }
        }
        turnCounter = 0; //reset turn counter
        player = 'X'; //set current player to X
        messageLabel.setText("Player X's Turn");
    }//GEN-LAST:event_newGameButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JButton square1;
    private javax.swing.JButton square2;
    private javax.swing.JButton square3;
    private javax.swing.JButton square4;
    private javax.swing.JButton square5;
    private javax.swing.JButton square6;
    private javax.swing.JButton square7;
    private javax.swing.JButton square8;
    private javax.swing.JButton square9;
    private javax.swing.JPanel squaresPanel;
    // End of variables declaration//GEN-END:variables
    
    //For move method
    JButton[] squares = new JButton[]{square1, square2, square3, square4, square5, square6, square7, square8, square9}; //put JButtons into an array
    private void checkWinner(char player) 
    {
        if (turnCounter > 3) //On 4th move check for winning condition
        {
            for (int i = 0; i < gameGrid.length; i++) //iterate through rows in array
            {
                if (gameGrid[i][0] == player && gameGrid[i][1] == player && gameGrid[i][2] == player) //check for win condition in array columns
                {
                    System.out.println("Player: "+player+" wins");
                    printWin(); //display winner message
                }
                else if (gameGrid[0][i] == player && gameGrid[1][i] == player && gameGrid[2][i] == player) //check for win condition in array rows
                {
                    printWin(); //display winner message
                }
            }
            if (gameGrid[0][0] == player && gameGrid[1][1] == player && gameGrid[2][2] == player) //check for win condition in top left to bottom right diagonal
            {
                printWin(); //display winner message
            }
            else if (gameGrid[2][0] == player && gameGrid[1][1] == player && gameGrid[2][0] == player) //check for win condition in top right to bottom left diagonal
            {
                printWin(); //display winner message
            }
        }
    }
    
    private char checkTurn(char player)
    {
        checkWinner(player);
        turnCounter++; //incrememnt turn counter
        if (turnCounter % 2 == 0) //if counter / 2 has no remainder
        {
            messageLabel.setText("Player X's Turn"); 
            player = 'X';
        }
        else if (turnCounter % 2 != 0) //if counter / 2 has remainder
        {
            messageLabel.setText("Player O's Turn"); 
            player = 'O'; 
//            move(player); //Method to generate computers move
//            turnCounter = 0; //Returns control to player X
//            messageLabel.setText("Player X's Turn");
//            player = 'X';
        }
        return player;
    }
    
    private void move(char player)
    {
        //Need to repeat until clear cell is found
        int x = new Random().nextInt(gameGrid.length); //generate random value between 0 & 3
        int y = new Random().nextInt(gameGrid.length); //generate random value between 0 & 3
        
        if (gameGrid[x][y] == ' ')
        {
            gameGrid[x][y] = player;
            squares[x+y].setText(player+"");
            squares[x+y].setEnabled(false);
        }
        else
        {
            move(player);
        }
    }

    private void printWin()
    {
        JButton[] squares = new JButton[]{square1, square2, square3, square4, square5, square6, square7, square8, square9}; //put JButtons into an array
        for (JButton square : squares) //iterate through array of JButtons
        {
            square.setEnabled(false); //disable all buttons
        }
        JOptionPane.showMessageDialog(this, "Player "+this.player+" Wins"); //show winners dialog
    }
}