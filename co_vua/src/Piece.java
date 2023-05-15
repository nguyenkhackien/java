public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * khoi tao.
     *
     * @param coordinatesX toa do x
     * @param coordinatesY toa do y
     * @param color        mau sac
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    /**
     * check diem dat quan co co hop ly k.
     *
     * @param piece quan co
     * @return true neu dung k thi false
     */
    public boolean checkPosition(Piece piece) {
        if (piece.getCoordinatesX() > 8 || piece.getCoordinatesX() < 1
                || piece.getCoordinatesY() > 8 || piece.getCoordinatesY() < 1) {
            return false;
        }
        return true;
    }
}
