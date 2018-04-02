package Lab3;

public class Rook extends ChessPiece {
    public final static int ROOK = 5;

    public Rook() {
        super(ROOK);
    }

    @Override
    void move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "horizontally or vertically";
    }
}
