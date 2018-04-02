package Lab3;

public class Knight extends ChessPiece {
    public final static int KNIGHT = 2;

    /**
     * Constructor to create a knight.
     */
    public Knight() {
        super(KNIGHT);
    }

    @Override
    void move() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "like an L";
    }
}
