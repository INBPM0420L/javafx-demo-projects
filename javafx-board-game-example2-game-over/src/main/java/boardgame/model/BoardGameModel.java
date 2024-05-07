package boardgame.model;

import javafx.beans.property.*;

public class BoardGameModel {

    public static final int BOARD_SIZE = 5;

    private final ReadOnlyObjectWrapper<Square>[][] board = new ReadOnlyObjectWrapper[BOARD_SIZE][BOARD_SIZE];

    private final ReadOnlyIntegerWrapper numberOfCoins = new ReadOnlyIntegerWrapper();

    private final ReadOnlyBooleanWrapper gameOver = new ReadOnlyBooleanWrapper();

    public BoardGameModel() {
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = new ReadOnlyObjectWrapper<>(Square.NONE);
            }
        }
        numberOfCoins.set(0);
        gameOver.bind(numberOfCoins.isEqualTo(BOARD_SIZE * BOARD_SIZE));
    }

    public ReadOnlyObjectProperty<Square> squareProperty(int i, int j) {
        return board[i][j].getReadOnlyProperty();
    }

    public Square getSquare(int i, int j) {
        return board[i][j].get();
    }

    public int getNumberOfCoins() {
        return numberOfCoins.get();
    }

    public ReadOnlyIntegerProperty numberOfCoinsProperty() {
        return numberOfCoins.getReadOnlyProperty();
    }

    public boolean isGameOver() {
        return gameOver.get();
    }

    public ReadOnlyBooleanProperty gameOverProperty() {
        return gameOver.getReadOnlyProperty();
    }

    public void makeMove(int i, int j) {
        int change = 0;
        board[i][j].set(
                switch (board[i][j].get()) {
                    case NONE -> {
                        change = 1;
                        yield Square.HEAD;
                    }
                    case HEAD -> Square.TAIL;
                    case TAIL -> {
                        change = -1;
                        yield Square.NONE;
                    }
                }
        );
        if (change != 0) {
            numberOfCoins.set(numberOfCoins.get() + change);
        }
    }

    public String toString() {
        var sb = new StringBuilder();
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var j = 0; j < BOARD_SIZE; j++) {
                sb.append(board[i][j].get().ordinal()).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var model = new BoardGameModel();
        System.out.println(model);
    }

}
