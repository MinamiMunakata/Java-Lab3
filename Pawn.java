package Lab3;

public class Pawn extends ChessPiece {

    public final static int PAWN = 1;
    private boolean hasBeenPromoted;
    private ChessPiece newPiece;
    private int currentPlaceOfPawn;
    public final static int FIRST_PLACE_OF_PAWN = 2;
    public final static int FAR_SIDE_OF_THE_BOARD = 8;

    /**
     * Constructor to create a pawn.
     */
    public Pawn() {
        super(PAWN);
        this.hasBeenPromoted = false;
        this.currentPlaceOfPawn = FIRST_PLACE_OF_PAWN;
    }

    /**
     * when a Pawn reaches the far side of the board, it is exchanged
     * for another ChessPiece; for example, a Pawn can “become” a Rook, or a Queen,
     * etc…. It cannot become a King or Pawn though.
     * @param newPiece represents an another ChessPiece which
     */
    @Override
    public void promote(ChessPiece newPiece) {
        if (currentPlaceOfPawn == FAR_SIDE_OF_THE_BOARD
                && !this.equals(newPiece) // this is not itself (!= Pawn)
                && newPiece.getValue() != King.KING
                && !hasBeenPromoted) {
            hasBeenPromoted = true;
            this.newPiece = newPiece;
        }
    }

    @Override
    void move() {
        System.out.println(toString());
        currentPlaceOfPawn++;
    }

    @Override
    public String toString() {
        return "forward 1";
    }

    /**
     * Pawns are NOT equal if one
     * has been promoted and another has not. Pawns are also NOT equal if they have been
     * promoted to different ChessPiece types.
     * @param obj an another ChessPiece.
     * @return true if Pawns are equal. Otherwise, return false.
     */
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){ // if obj is a pawn
            if ((!hasBeenPromoted) && (!(((ChessPiece) obj).getHasBeenPromoted()))) { // if both of them are not promoted.
                return true;
            } else if ((hasBeenPromoted) && (((ChessPiece) obj).getHasBeenPromoted())) { // if both of them are promoted.
                return (newPiece == ((ChessPiece) obj).getNewPiece()); // if they have been promoted to same ChessPiece types.
            }
        }
        return false;
    }

    public boolean getHasBeenPromoted() {
        return this.hasBeenPromoted;
    }

    public void setHasBeenPromoted(boolean hasBeenPromoted) {
        this.hasBeenPromoted = hasBeenPromoted;
    }

    public ChessPiece getNewPiece() {
        return this.newPiece;
    }

    public void setNewPiece(ChessPiece newPiece) {
        this.newPiece = newPiece;
    }

    public int getCurrentPlaceOfPawn() {
        return this.currentPlaceOfPawn;
    }

    public void setCurrentPlaceOfPawn(int currentPlaceOfPawn) {
        this.currentPlaceOfPawn = currentPlaceOfPawn;
    }
}
