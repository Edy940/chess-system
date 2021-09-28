package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    //Construtor
    public Piece(Board board) {
        this.board = board;
        position = null;

    }

    //Geters e Seters
    protected Board getBoard() {
        return board;
    }

}
