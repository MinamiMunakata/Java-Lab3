package Lab3;

public class Bishop extends ChessPiece {

    public final static int BISHOP = 3;

    /**
     * Constructor to create a bishop.
     */
    public Bishop() {
        super(BISHOP);
    }

    @Override
    void move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "diagonally";
    }
}
