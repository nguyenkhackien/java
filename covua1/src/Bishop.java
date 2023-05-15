import java.util.ArrayList;

public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x > 8 || y > 8 || x < 1 || y < 1) {
            return false;
        }

        if (Math.abs(x - getCoordinatesX()) != Math.abs(y - getCoordinatesY())) {
            return false;
        }

        ArrayList<Piece> pieces = board.getPieces();
        for (int i = 0; i < pieces.size(); ++i) {
            if (pieces.get(i) == this) {
                continue;
            }
            Piece temp = pieces.get(i);
            int X = getCoordinatesX();
            int Y = getCoordinatesY();
            int tempX = temp.getCoordinatesX();
            int tempY = temp.getCoordinatesY();
            if (!temp.getColor().equals(getColor())
                    && tempX == x && tempY == y) {
                return true;
            }
            System.out.println(X + " " + Y + " " + tempX + " " + tempY
                    + " " + x + " " + y + "\n");
            int x1 = x - X;
            int y1 = y - Y;
            int x2 = tempX - X;
            int y2 = tempY - Y;
            int x3 = x - tempX;
            int y3 = y - tempY;
            if (Math.abs(x1 * x2) == Math.abs(y1 * y2)) {
                double v1 = Math.sqrt(x1 * x1 + y1 * y1);
                double v2 = Math.sqrt(x2 * x2 + y2 * y2);
                double v3 = Math.sqrt(x3 * x3 + y3 * y3);
                v1 = Math.floor(v1 * 100) / 100.0;
                v2 = Math.floor(v2 * 100) / 100.0;
                v3 = Math.floor(v3 * 100) / 100.0;
                if (v2 + v3 == v1) {
                    return false;
                }
            }
        }
        return true;
    }
}
