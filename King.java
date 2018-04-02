package Lab3;

public class King extends ChessPiece{

    public final static int KING = 1000;

    /**
     * Constructor to create a king.
     */
    public King() {
        super(KING);
    }

    @Override
    void move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "one square";
    }
}
