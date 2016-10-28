
import java.awt.Color;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the game board
        Board board = new Board(12,12);
        // put a coloured peg at row, column
        Doctor Phil = new Doctor((int)(Math.random()*12),(int) (Math.random()*12));
        board.putPeg(Color.GREEN, Phil.getRow(), Phil.getCol());
        Dalek A1 = new Dalek((int)(Math.random()*12),(int) (Math.random()*12), false);
        board.putPeg(Color.BLACK, A1.getRow(), A1.getCol());
        Dalek A2 = new Dalek((int)(Math.random()*12),(int) (Math.random()*12), false);
        board.putPeg(Color.BLACK, A2.getRow(), A2.getCol());
        Dalek A3 = new Dalek((int)(Math.random()*12),(int) (Math.random()*12), false);
        board.putPeg(Color.BLACK, A3.getRow(), A3.getCol());
        
        // put a message on the board
        board.displayMessage("Please click the board to start the game.");
        
        while(true){
        // get a click on the board
        Coordinate click = board.getClick();
        board.removePeg(Phil.getRow(), Phil.getCol());
        // get the row and column
        int row = click.getRow();
        int col = click.getCol();
        Phil.move(row, col);
        int newRow = Phil.getRow();
        int newCol = Phil.getCol();
        // place a magenta peg when clicked
        board.putPeg(Color.green, Phil.getRow(), Phil.getCol());
        
        board.removePeg(A1.getRow(), A1.getCol());
        board.removePeg(A2.getRow(), A2.getCol());
        board.removePeg(A3.getRow(), A3.getCol());
        
        A1.advanceTowards(Phil);
        A2.advanceTowards(Phil);
        A3.advanceTowards(Phil);
        
        board.putPeg(Color.BLACK, A1.getRow(), A1.getCol());
        board.putPeg(Color.BLACK, A2.getRow(), A2.getCol());
        board.putPeg(Color.BLACK, A3.getRow(), A3.getCol());
        
        if(A1.getRow() == A2.getRow() && A1.getCol() == A2.getCol()){
            board.putPeg(Color.RED, A1.getRow(), A1.getCol());
            A1.crashed();
            A2.crashed();
        }
        if(A2.getRow() == A3.getRow() && A2.getCol() == A3.getCol()){
            board.putPeg(Color.RED, A2.getRow(), A2.getCol());
            A2.crashed();
            A3.crashed();
        }
        if(A3.getRow() == A1.getRow() && A3.getCol() == A1.getCol()){
            board.putPeg(Color.RED, A3.getRow(), A3.getCol());
            A1.crashed();
            A3.crashed();
        }
        if(A1.hasItCrashed() == true && A2.hasItCrashed() == true && A3.hasItCrashed() == true){
            board.displayMessage("All the daleks have crashed; you won!");
            break;
        }
        
        
        if(Phil.getRow() == A1.getRow() && Phil.getCol() == A1.getCol()){
            board.putPeg(Color.yellow, Phil.getRow(), Phil.getRow());
            board.displayMessage("The Doctor has been captured; you lose!");
            break;
        }
        if(Phil.getRow() == A2.getRow() && Phil.getCol() == A2.getCol()){
            board.putPeg(Color.yellow, Phil.getRow(), Phil.getRow());
            board.displayMessage("The Doctor has been captured; you lose!");
            break;
        }
        if(Phil.getRow() == A3.getRow() && Phil.getCol() == A3.getCol()){
            board.putPeg(Color.yellow, Phil.getRow(), Phil.getRow());
            board.displayMessage("The Doctor has been captured; you lose!");
            break;
        }
        }
        
        
        
        
    }
}
