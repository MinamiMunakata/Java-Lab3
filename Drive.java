package Lab3;

public class Drive {
    public static void main(String[] args) {
        ChessPiece pawn1 = new Pawn();
        ChessPiece pawn2 = new Pawn();
        ChessPiece pawn3 = new Pawn();
        ChessPiece pawn4 = new Pawn();
        ChessPiece queen1 = new Queen();
        ChessPiece queen2 = new Queen();
        ChessPiece knight = new Knight();
        System.out.print("pawn1 and pawn2 are equal: ");
        System.out.println(pawn1.equals(pawn2));
        System.out.print("pawn1 and queen1 are equal: ");
        System.out.println(pawn1.equals(queen1));

        for (int i = 0; i < 6 ; i++) {
            pawn1.move();
            pawn3.move();
        }
        queen1.move();
        knight.move();

        pawn1.promote(queen1);
        System.out.println("pawn1 is promoted to queen1.");
        pawn3.promote(queen1);
        System.out.println("pawn3 is also promoted to queen1.");
        pawn4.promote(knight);
        System.out.println("pawn4 is promoted to knight.");
        knight.promote(queen1); // Nothing happens

        System.out.print("pawn1 and pawn2 are equal: ");
        System.out.println(pawn1.equals(pawn2));
        System.out.print("pawn1 and pawn3 are equal: ");
        System.out.println(pawn1.equals(pawn3));
        System.out.print("pawn1 and pawn4 are equal: ");
        System.out.println(pawn1.equals(pawn4));
        System.out.print("pawn1 and queen1 are equal: ");
        System.out.println(pawn1.equals(queen1));
        System.out.print("queen1 and knight are equal: ");
        System.out.println(queen1.equals(knight));
        System.out.print("queen1 and queen2 are equal: ");
        System.out.println(queen1.equals(queen2));
    }
}
