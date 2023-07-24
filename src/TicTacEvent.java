/*
Conner Recoskie
Date: April 24th 2023
This program is a 4 x 4 tic-tac-toe game that allows two people to play against
eachother. 
*/
// Getting the classes that will be needed in the program
import javax.swing.*;
import java.awt.event.*;

// Creating a class that responds to mouse and keyboard input by "listening"
public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    // Associating the game board with the event
    TicTac gui;
    Thread playing;
    
    // Creating Image Icon elements for the "x" and "o" icons
    ImageIcon a = new ImageIcon("Src\\TicTacImages\\x-pic.jpg");
    ImageIcon b = new ImageIcon("Src\\TicTacImages\\O-Pic.jpg");
    
    // Creating variables to help with checking for the winner. 
    int clicks = 0;
    int win = 0;
    int[][] check = new int[4][4];
    int xWins = 0;
    int oWins = 0;
    int tie = 0;
    

    // Associating the two files to be used together
    public TicTacEvent (TicTac in){
        gui = in;
        
        // Initiating the "winner check" array
        for (int row=0; row<=3; row++)
        {
           for (int col=0; col<=3; col++)
           {
               check[row][col]=0;
           }
       }
    }
    
    @Override
    // Telling the program what to do when a button is pressed
    public void actionPerformed (ActionEvent event) {
        // Takes the button name as input from the button that is clicked
        String command = event.getActionCommand();

        // Checking the "command" variable and calling the appropriate method
        if (command.equals("Play")) 
        {
            startPlaying();
        }
        if (command.equals("1")) 
        {
            b1();
        }
        if (command.equals("2"))
        {
            b2();
        }
        if (command.equals("3")) 
        {
            b3();
        }
        if (command.equals("4"))
        {
            b4();
        }
        if (command.equals("5")) 
        {
            b5();
        }
        if (command.equals("6"))
        {
            b6();
        }
        if (command.equals("7")) 
        {
            b7();
        }
        if (command.equals("8")) 
        {
            b8();
        }
        if (command.equals("9")) 
        {
            b9();
        }
        if (command.equals("10"))
        {
            b10();
        }
        if (command.equals("11"))
        {
            b11();
        }
        if (command.equals("12"))
        {
            b12();
        }
        if (command.equals("13"))
        {
            b13();
        }
        if (command.equals("14"))
        {
            b14();
        }
        if (command.equals("15"))
        {
            b15();
        }
        if (command.equals("16"))
        {
            b16();
        }
        if (command.equals("Play Again"))
        {
            playAgain();     
        }
    }
    void b1() 
    {   
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;
        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[0][0].setIcon(a);
            check[0][0] = 1;
        }
        // Putting an "O" on the board and declaring that square to be taken
        else
        {
            gui.boxes[0][0].setIcon(b);
            check[0][0] = 2;
        }
        // Calling the "winner" method
        winner();
    }

    void b2() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[0][1].setIcon(a);
            check[0][1] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[0][1].setIcon(b);
            check[0][1] = 2;
        }
        winner();
    }

    void b3() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[0][2].setIcon(a);
            check[0][2] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[0][2].setIcon(b);
            check[0][2] = 2;
        }
        winner();
    }

    void b4() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[0][3].setIcon(a);
            check[0][3] = 1;
        }
        // Putting an "O" on the board and declaring that square to be taken
        else
        {
            gui.boxes[0][3].setIcon(b);
            check[0][3] = 2;
        }
        winner();
    }

    void b5() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;
        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[1][0].setIcon(a);
            check[1][0] = 1;
        }
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[1][0].setIcon(b);
            check[1][0] = 2;
        }

        winner();
    }
    void b6() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;
        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[1][1].setIcon(a);
            check[1][1] = 1;
        }
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[1][1].setIcon(b);
            check[1][1] = 2;
        }
        winner();
    }
    void b7()
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[1][2].setIcon(a);
            check[1][2] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else
        {
            gui.boxes[1][2].setIcon(b);
            check[1][2] = 2;
        }
        winner();
    }
    void b8() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;
        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[1][3].setIcon(a);
            check[1][3] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else
        {
            gui.boxes[1][3].setIcon(b);
            check[1][3] = 2;
        }
        winner();
    }
    void b9() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[2][0].setIcon(a);
            check[2][0] = 1;
        }
        // Putting an "O" on the board and declaring that square to be taken
        else
        {
            gui.boxes[2][0].setIcon(b);
            check[2][0] = 2;
        }
        winner();
    }
    void b10() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[2][1].setIcon(a);
            check[2][1] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[2][1].setIcon(b);
            check[2][1] = 2;
        }
        winner();
    }
    void b11() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[2][2].setIcon(a);
            check[2][2] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[2][2].setIcon(b);
            check[2][2] = 2;
        }
        winner();
    }
    void b12() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[2][3].setIcon(a);
            check[2][3] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[2][3].setIcon(b);
            check[2][3] = 2;
        }
        winner();
    }
    void b13() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[3][0].setIcon(a);
            check[3][0] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[3][0].setIcon(b);
            check[3][0] = 2;
        }
        winner();
    }
    void b14() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[3][1].setIcon(a);
            check[3][1] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[3][1].setIcon(b);
            check[3][1] = 2;
        }
        winner();
    }
    void b15() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[3][2].setIcon(a);
            check[3][2] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[3][2].setIcon(b);
            check[3][2] = 2;
        }
        winner();
    }
    void b16() 
    {
        // Keeping track of the # of boxes chosen
        clicks = clicks + 1;

        // Putting an "X" on the board and declaring that square to be taken
        if ((clicks%2)==1)
        {
            gui.boxes[3][3].setIcon(a);
            check[3][3] = 1;
        } 
        // Putting an "O" on the board and declaring that square to be taken
        else 
        {
            gui.boxes[3][3].setIcon(b);
            check[3][3] = 2;
        }
        winner();
    }
    
    void startPlaying()
    {
    // Execution of the program    
    playing = new Thread(this);

    // Starting the game
    playing.start();

    // Disabling the play button
    gui.play.setEnabled(false);
    }

    void winner() 
    {
    // Checking each row horizontally
    for (int x=0; x<=3; x++)
    {
        // Checking if all enteries are "X" or "O"
        if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2]) && (check[x][0] == check[x][3])) 
        {
            if (check[x][0]==1)
            {
                // Creating a pop up declaring x is the winner 
                JOptionPane.showMessageDialog(null, "X is the winner");
                win = 1;
                xWins += 1;
            }
            else if (check[x][0]==2)
            {
                // Creating a pop up declaring o is the winner
                JOptionPane.showMessageDialog(null, "O is the winner");
                win = 1;
                oWins += 1;
            }
        }
    }
    // Checking each row vertically
    for (int x=0; x<=3; x++)
    {
        // Checking if all enteries are "X" or "O"
        if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])&&(check[0][x]==check[3][x]))
        {
            if (check[0][x]==1)
            {   
                // Creating a pop up declaring x is the winner
                JOptionPane.showMessageDialog(null, "X is the winner");
                win = 1;
                xWins += 1;
            } 
            else if (check[0][x]==2) 
            {   
                // Creating a pop up declaring o is the winner
                JOptionPane.showMessageDialog(null, "O is the winner");
                win = 1;
                oWins += 1;
            }
        }
    }
        // Check for diagonal wins
    if ((check[0][0] == check[1][1]) && (check[1][1] == check[2][2]) && (check[2][2] == check[3][3]))
    {
        // Diagonal from top-left to bottom-right
        if (check[0][0] == 1) {
            // "X" has won
            JOptionPane.showMessageDialog(null, "X is the winner");
            xWins += 1;
            win = 1;
        } else if (check[0][0] == 2) {
            // "O" has won
            JOptionPane.showMessageDialog(null, "O is the winner");
            oWins += 1;
            win = 1;
        }
    }
    else if ((check[3][0] == check[2][1]) && (check[2][1] == check[1][2]) && (check[1][2] == check[0][3]))
    {
        // Diagonal from top-right to bottom-left
        if (check[3][0] == 1) {
            // "X" has won
            JOptionPane.showMessageDialog(null, "X is the winner");
            xWins += 1;
            win = 1;
        } else if (check[3][0] == 2) {
            // "O" has won
            JOptionPane.showMessageDialog(null, "O is the winner");
            oWins += 1;
            win = 1;
        }
    }


    // Checking for a tie in the game (16 boxes clicked, with no win)
    if ((clicks==16) && (win==0))
    {
        JOptionPane.showMessageDialog(null, "The game is a tie");
        tie += 1;
    }
    // Setting the Jlabels to display the wins, and or ties
    gui.xWin.setText("X Wins: " + xWins);
    gui.oWin.setText("O Wins: " + oWins);
    gui.amountOfTies.setText("Ties: " + tie);
    }
    void playAgain()
    {   
        // Setting all the icons back to the "back" icon
        for (int i = 0; i <= 3; i++)
        {
            for (int k = 0; k <= 3; k++)
            {
                gui.boxes[i][k].setIcon(gui.back);
            }
        }

        
        // Re-initiating the "winner check" array
        for (int r=0; r<=3; r++)
        {
           for (int c=0; c<=3; c++)
           {
               check[r][c]=0;
           }
       }
    // Resetting the "clicks" variable
    clicks = 0;
    
    // Resetting the "win" variable
    win = 0;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}