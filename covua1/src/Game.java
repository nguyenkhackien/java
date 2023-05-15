import java.util.ArrayList;

public class Game {
    private Board board;
    private java.util.ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(), x, y, piece);
            ArrayList<Piece> pieces = board.getPieces();
            for (int i = 0; i < pieces.size(); ++i) {
                if (pieces.get(i).getCoordinatesX() == x
                        && pieces.get(i).getCoordinatesY() == y) {
                    move.setKilledPiece(pieces.get(i));
                    pieces.remove(i);
                    break;
                }
            }
            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

}
