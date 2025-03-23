package TicTacToeGame;

public class Player {

    private PlayingPiece playingPiece;
    private String name;

    public Player(String name, PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
        this.name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public String getName() {
        return name;
    }

}
