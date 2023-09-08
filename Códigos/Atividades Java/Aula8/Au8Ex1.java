public class Au8Ex1{
    public static void main(String[] args) {
        String[][] game = new String[3][3];

        fillEmpty(game);
        System.out.println("The game beggin! You are X!");

    }
    public static String[][] fillEmpty(String[][] game){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                game[i][j] = "-";
            }
        }
        return game;
    }
}
