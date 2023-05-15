import java.util.Objects;

public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    public String getSymbol() {
        return "R";
    }

    /**
     * kiem tra co di chuyen duoc k.
     *
     * @param board ban co
     * @param x     diem den x
     * @param y     diem den y
     * @return true neu di chuyen duoc
     */
    public boolean canMove(Board board, int x, int y) {
        if (checkPosition(this)) {
            boolean check = true;
            for (Piece p : board.getPieces()) {
                if (p.getCoordinatesX() == x) {
                    if (p.getCoordinatesY() < this.getCoordinatesY()
                            && p.getCoordinatesY() > y) {
                        check = false;
                    }
                    if (p.getCoordinatesY() > this.getCoordinatesY()
                            && p.getCoordinatesY() < y) {
                        check = false;
                    }
                }
                if (p.getCoordinatesX() == y) {
                    if (p.getCoordinatesX() < this.getCoordinatesY()
                            && p.getCoordinatesX() > x) {
                        check = false;
                    }
                    if (p.getCoordinatesX() > this.getCoordinatesY()
                            && p.getCoordinatesX() < x) {
                        check = false;
                    }
                }
                if (p.getCoordinatesY() == y && p.getCoordinatesX() == x && p.getColor().equals(this.getColor())) {
                    check = false;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }
}
