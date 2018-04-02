package Lab3;

/**
 * @author Minami Munakata
 */

/**
 * A parent abstract class which has child classes called
 Pawn, Knight, Bishop, Rook, Queen, and King.
 */
public abstract class ChessPiece {
    protected int value;

    /**
     * Constructor
     * @param value which indicates how
    ‘important’ it is.
     */
    public ChessPiece(int value) {
        this.value = value;
    }

    /**
     * System.out.println() how this particular piece moves.
     */
    abstract void move();

    /**
     * Only pawn can call promote method.
     * @param newPiece represents an another ChessPiece which
     *                 pawn will be promoted to.
     */
    public void promote(ChessPiece newPiece) {
        if (value == Pawn.PAWN)
        promote(newPiece);
    }

    @Override
    public abstract String toString();

    /**
     * If two ChessPiece objects have the same value of each other, they are considered
     * equal.
     * @param obj an another ChessPiece.
     * @return true if two ChessPiece objects have the same value of each other, otherwise return false.
     */
    @Override
    public boolean equals(Object obj) {
        return (value == ((ChessPiece)obj).value);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getHasBeenPromoted() {
        return getHasBeenPromoted();
    }

    public ChessPiece getNewPiece() {
        return getNewPiece();
    }
}
