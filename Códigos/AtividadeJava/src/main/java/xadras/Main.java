package xadras;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println("Tabuleiro inicial:");
        System.out.println(board.toString());

        // Testes de movimentação
        testMovements(board);
    }

    private static void testMovements(Board board) {
        // Movendo um peão branco para frente
        System.out.println("Movendo um peão branco para frente:");
        boolean move1 = board.movePiece(1, 0, 3, 0);  // movimento válido
        System.out.println("Move 1 (1,0) -> (3,0): " + move1);
        System.out.println(board.toString());

        // Movendo uma torre branca
        System.out.println("Movendo uma torre branca:");
        boolean move2 = board.movePiece(0, 0, 3, 0);  // movimento inválido, tem peão na frente
        System.out.println("Move 2 (0,0) -> (3,0): " + move2);
        System.out.println(board.toString());

        // Movendo um cavalo branco
        System.out.println("Movendo um cavalo branco:");
        boolean move3 = board.movePiece(0, 1, 2, 2);  // movimento válido
        System.out.println("Move 3 (0,1) -> (2,2): " + move3);
        System.out.println(board.toString());

        // Movendo um bispo branco
        System.out.println("Movendo um bispo branco:");
        boolean move4 = board.movePiece(0, 2, 2, 4);  // movimento inválido, tem peão na frente
        System.out.println("Move 4 (0,2) -> (2,4): " + move4);
        System.out.println(board.toString());

        // Movendo a rainha branca
        System.out.println("Movendo a rainha branca:");
        boolean move5 = board.movePiece(0, 3, 3, 3);  // movimento inválido, tem peão na frente
        System.out.println("Move 5 (0,3) -> (3,3): " + move5);
        System.out.println(board.toString());

        // Movendo o rei branco
        System.out.println("Movendo o rei branco:");
        boolean move6 = board.movePiece(0, 4, 1, 4);  // movimento inválido
        System.out.println("Move 6 (0,4) -> (1,4): " + move6);
        System.out.println(board.toString());
    }
}
