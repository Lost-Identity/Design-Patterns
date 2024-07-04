import model.PlayingPiece;


import java.util.HashMap;
import java.util.Map;


public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){

        if(board[row][column] != null){
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }

    public Map<Integer, Integer> getFreeCells(){
        Map<Integer, Integer> freeCells = new HashMap<>();

        for(int i = 0; i < size ; i++){
            for(int j = 0; j < size; j++){
//                Map<Integer, Integer> rowColumn = new HashMap<>(i, j);
                freeCells.put(i, j);
            }
        }
        return freeCells;
    }

    public void printBoard(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j].pieceType.name() + "   ");
                }
                else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
