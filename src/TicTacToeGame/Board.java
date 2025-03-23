package TicTacToeGame;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Board {

    private int size;

    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public List<Pair<Integer, Integer>> getAllFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }
        return freeCells;
    }

    public boolean setCellValue(int row, int col, PlayingPiece piece) {
        if (board[row][col] == null) {
            board[row][col] = piece;
            return true;
        }
        return false;
    }

    public PlayingPiece[][] getBoard() {
        return this.board;
    }

    public int getSize() {
        return this.size;
    }


}
