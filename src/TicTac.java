/*
Conner Recoskie
Date: April 24th 2023
This program is a 4 x 4 tic-tac-toe game that allows two people to play against
eachother. 
*/

// Importing libraries to make drawing classes ready to use
import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    // Joining the two programs to work together
    TicTacEvent tictac = new TicTacEvent(this);
    
    // Creating the outline box
     JPanel row1 = new JPanel();
     
    // Creating nine buttons in a 2D array that is 3 x 3.
    JButton[ ] [ ] boxes = new JButton [4][4];
    
    // Creating the "play button"
    JButton play = new JButton ("Play");
    
    // Creating the "play again" button
    JButton newGame = new JButton ("Play Again");
    
    // Creating text-fields for the GUI
    JTextField xWin = new JTextField();
    JTextField oWin = new JTextField();
    JTextField amountOfTies = new JTextField();

    // Creating an ImageIcon element for the card back image
    ImageIcon back = new ImageIcon("Src\\TicTacImages\\card-back.jpg");
    
    // Creating the method to draw the game board
    public TicTac() {

        // Creating the outer frame with the title
        super ("Tic Tac Toe");
        
        // Setting the size of the outer frame
        setSize (600,700);
        
        
        
        // Setting the program to quit running when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Arranging components from left to right
        // Centering components horizontally with a five pixel gap between them.
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;
        
        // Arranging the components in a rectangular grid, with all cells of equal size
        GridLayout layout1 = new GridLayout(6, 4, 10, 10);
        
        // Creating and adding the buttons to the GridLayout's first four rows
        row1.setLayout(layout1);
        for (int x=0; x<=3; x++)
        {
            for (int y=0; y<=3; y++)
            {
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        // Setting the "Jlabels" an initial value
        xWin.setText("X Wins: 0");
        oWin.setText("O Wins: 0");
        amountOfTies.setText("Ties: 0");
        
        // Adding the remaining components to the GridLayout
        row1.add(play);
        row1.add(xWin);
        row1.add(oWin);
        row1.add(amountOfTies);
        row1.add(newGame);
        
        // Adds the GridLayout to the FlowLayout.
        add (row1);
        
        // Making the program ready for mouse clicks
         play.addActionListener(tictac);
        for (int x=0; x <= 3; x++)
        {
            for (int y=0; y<=3; y++)
            {
                boxes[x][y].addActionListener(tictac);
            }
        }
        
        // Adding an action listner for the "play again" button
        newGame.addActionListener(tictac);

        
        // Showing the FlowLayout on the screen
        setVisible(true);
    }
    public static void main(String[] arguments){
        // Runing the screen layout class
        TicTac frame = new TicTac();
        }   
}
