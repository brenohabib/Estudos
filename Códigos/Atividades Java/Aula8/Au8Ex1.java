import java.util.Scanner;
public class Au8Ex1 {

    public static void main(String[] args) {
        
        String[][] board = new String[3][3];
        boolean running = true;
        Scanner input = new Scanner(System.in);
        int[] move = new int[2];

        board = emptyBoard();

        System.out.println("The game beggins! you are X");


        while(running){

            printBoard(board);
            boolean playing = true;

            System.out.println("You play now! choose the line (0 to 2)");
            move[0] = input.nextInt();

            System.out.println("Now choose the column (0 to 2)");
            move[1] = input.nextInt();

            while(playing){
                if(isValidMove(board, move)){

                    board[move[0]][move[1]] = "X";
                    playing = false;
                }
                else{
                    System.out.println("Invalid move! Try again");
                    System.out.println("choose line: ");
                    move[0] = input.nextInt();
                    System.out.println("choose column: ");
                    move[1] = input.nextInt();
                }
            }
            if(checkWin(board, "X")){
                System.out.println("You win! Congrats");
                printBoard(board);
                break;
            }
            if(isBoardFull(board)){
                System.out.println("Tie!");
                printBoard(board);
                break;
            }
                
                
            System.out.println("IA is playing now!\n");

            playing = true;

            move[0] = (int)(Math.random()*4);
            move[1] = (int)(Math.random()*4);

            while(playing){
                if(isValidMove(board, move)){

                    board[move[0]][move[1]] = "O";
                    playing = false;
                }
                else{
                    move[0] = (int)(Math.random()*4);
                    move[1] = (int)(Math.random()*4);
                }
            }
            if(checkWin(board, "O")){
                System.out.println("You lose! that's sad");
                printBoard(board);
                running = false;
            }
        }
        input.close();

    }
    public static void printBoard(String[][] board){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                System.out.print(" | " + board[i][j]);
            }

            System.out.println(" | ");
        }

    }
    public static String[][] emptyBoard(){

        String[][] board = new String[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                board[i][j] = "-";
            }
        }

        return board;
    }
    public static boolean isValidMove(String[][] board, int[] move){

        int row = move[0];
        int col = move[1];

        if(row >= 0 && row < 3 && col >=0 && col <3 && board[row][col].equals("-")){

            return true;
        }
        else{

            return false;
        }
    }
    public static boolean checkWin(String[][] board, String currentPlayer){

        for(int i = 0; i < 3; i++){
            if(board[i][0].equals(currentPlayer) && board[i][1].equals(currentPlayer) && board[i][2].equals(currentPlayer)){
                return true;
            }
            if(board[0][i].equals(currentPlayer) && board[1][i].equals(currentPlayer) && board[2][i].equals(currentPlayer)){
                return true;
            }
        }
        if(board[0][0].equals(currentPlayer) && board[1][1].equals(currentPlayer) && board[2][2].equals(currentPlayer)){
            return true;
        }
        if(board[0][2].equals(currentPlayer) && board[1][1].equals(currentPlayer) && board[2][0].equals(currentPlayer)){
            return true;
        }

        return false;
    }
    public static boolean isBoardFull(String[][] board){

        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j].equals("-")){

                    return false;
                }
            }
        }

        return true;
    }

}