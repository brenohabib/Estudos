import java.util.Scanner;
public class Au8Ex1 {

    public static void main(String[] args) {
        
        String[][] board = new String[3][3];
        boolean running = true;
        Scanner input = new Scanner(System.in);

        board = startBoard(board);
        printBoard(board);

        System.out.println("The game beggins! you are X");


        while(running){

            // Ideia do jogo


        }

    }
    public static void printBoard(String[][] board){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(" | ");
            }
            System.out.println();
        }

    }
    public static String[][] startBoard(String[][] board){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = "-";
            }
        }

        return board;
    }

}