package Lab3;

public class Queen extends ChessPiece {
    public final static int QUEEN = 9;

    /**
     * Constructor to create a queen.
     */
    public Queen() {
        super(QUEEN);
    }

    @Override
    void move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "like a bishop or a rook";
    }
}
