/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Doctor {
    private int row;
    private int col;
    
    
    public Doctor(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    public void move(int newRow, int newCol){
        int rRow = (int) (Math.random() * 12);
        int rCol = (int) (Math.random() * 12);
        int rowMove = this.row - newRow;
        int colMove = this.col - newCol;
        if(rowMove <= 1 && rowMove >= -1 && colMove <= 1 && colMove >= -1){
            this.col = newCol;
            this.row = newRow;
        } else {
            this.col = rCol;
            this.row = rRow;
        }
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    
}
