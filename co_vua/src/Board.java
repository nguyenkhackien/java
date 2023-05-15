import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;

    public static final int HEIGHT = 8;

    private java.util.ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {

    }

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    boolean validate(int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        return true;
    }

    /**
     * add piece.
     *
     * @param piece piece
     */
    public void addPiece(Piece piece) {
        if (piece.checkPosition(piece)) {
            boolean check = true;
            for (Piece p : pieces) {
                if (p.getCoordinatesX() == piece.getCoordinatesX()
                        && p.getCoordinatesY() == piece.getCoordinatesY()) {
                    check = false;
                }
            }
            if (check) {
                pieces.add(piece);
            }
        }
    }

    /**
     * get At.
     *
     * @param x toa do x
     * @param y toa do y
     * @return piece tai vi tri x,y
     */
    public Piece getAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }
        return null;
    }

    /**
     * xoa quan co tai vi tri x,y.
     *
     * @param x toa do x
     * @param y toa do y
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(pieces.get(i));
            }
        }
    }
}
