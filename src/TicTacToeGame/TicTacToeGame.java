package TicTacToeGame;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

public class TicTacToeGame {

    Deque<Player> players;
    Board board;

    TicTacToeGame() {
        initializePlayers();
    }

    private void initializePlayers() {
        // Initialize players
        players = new ArrayDeque<>();
        players.add(new Player("Player 1", new PlayingPieceX()));
        players.add(new Player("Player 2", new PlayingPieceO()));
        board = new Board(3);
    }

    public String startGame() {
        // Game logic goes here
        boolean gameOver = false;
        while (true) {
            // Player turn
           Player player =  players.removeFirst();

            System.out.println("row and column (e.g., 1 2): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int row = Integer.parseInt(input.split(",")[0]);
            int col = Integer.parseInt(input.split(",")[1]);
            List<Pair<Integer, Integer>> freeCells = board.getAllFreeCells();

            if (freeCells.isEmpty()) {
                System.out.println("Board is full. Game over!");
                break;
            }
            boolean success = board.setCellValue(row, col, player.getPlayingPiece());
            if (!success) {
                System.out.println("Invalid move. Try again.");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean winningCondition = checkWinningCondition(row, col, player.getPlayingPiece(), board.getSize());
            if (winningCondition) {
                System.out.println(player.getName() + " wins!");
                break;
            }
        }
        return "Game Tie!";
    }


    private boolean checkWinningCondition(int row, int col, PlayingPiece piece, int size) {
        // Check row, column, and diagonal for winning condition
        boolean rowWin = true;
        boolean colWin = true;
        boolean diagonalWin = true;
        boolean antiDiagonalWin = true;

        for (int j = 0; j < size ; j++) {
            if (board.getBoard()[row][j] == null || board.getBoard()[row][j]!= piece) {
                rowWin = false;
                break;
            }
        }

        for (int i = 0; i < size ; i++) {
            if (board.getBoard()[i][col] == null || board.getBoard()[i][col]!= piece) {
                colWin = false;
                break;
            }
        }

        for (int i = 0, j = 0; i < size && j < size; i++, j++) {
            if (board.getBoard()[i][j] == null || board.getBoard()[i][j]!= piece) {
                diagonalWin = false;
                break;
            }
        }

        for (int i = 0, j = size - 1; i < size && j >= 0; i++, j--) {
            if (board.getBoard()[i][j] == null || board.getBoard()[i][j]!= piece) {
                antiDiagonalWin = false;
                break;
            }
        }

        // Implement this method
        return rowWin || colWin || diagonalWin || antiDiagonalWin;
    }
}
