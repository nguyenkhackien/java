import java.util.ArrayList;

public class Game {
    private Board board;

    private java.util.ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }

    public void setMoveHistory(ArrayList<Move> movehistory) {
        this.moveHistory = movehistory;
    }

    /**
     * di chuyen quan co.
     *
     * @param piece quan di chuyen
     * @param x     toa do diem den x
     * @param y     toa do diem den y
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move;
            if (board.getAt(x, y) != null) {
                move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(),
                        x, y, piece, board.getAt(x, y));
                board.getPieces().remove(board.getAt(x, y));
            } else {
                move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(), x, y, piece);
            }
            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }
}
