/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Dalek {
    private int row;
    private int col;
    private boolean hasItCrashed;
    
    public Dalek(int row, int col, boolean hasItCrashed){
        this.row = row;
        this.col = col;
    }
    
    public void advanceTowards(Doctor Phil){
        int Row = Phil.getRow();
        int Col = Phil.getCol();
        
        int RowMove = this.row - Row;
        int ColMove = this.col - Col;
        
        if(hasItCrashed){
            
        }else{
        
        if(RowMove <= 0){
            this.row++;
        }
        if(RowMove >= 0){
            this.row--;
        }
        if(ColMove <= 0){
            this.col++;
        }
        if(ColMove >= 0){
            this.col--;
        }
    }
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    public boolean hasItCrashed(){
        
        return this.hasItCrashed;
    }
    
    public void crashed(){
        this.hasItCrashed = true;
    }
}
