package SnakeLadderLLD;

public class Board {
    Cell[][] cells;

    public Board(int size, int numberOfSnakes, int numberOfLadders) {
        initializeCells(size);
        addSnakesAndLadders(numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int size) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesAndLadders(int numberOfSnakes, int numberOfLadders) {
        // Implement this method
        while (numberOfSnakes > 0) {
//            int snakeHead = RandomUtils.nextInt(0, cells.length - 1);
        }
    }
}
