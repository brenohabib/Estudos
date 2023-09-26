package atividade.Prova1;

public class P1At4 {
    public static void main(String[] args) {
        String[][]matriz = new String[21][21];
        int a = 10;
        int b = 10;
        int r = 7;
        for(int y = 0; y < matriz.length; y++){
            for(int x = 0; x < matriz[y].length; x++){
                //if(((x^2 + y^2) - ((2*a*x) - (2*b*y)) + (a^2 + b^2 - r^2)) <= 0){
                if(x*x + y*y - 2*a*x - 2*b*y + a*a + b*b - r*r <=0){  
                    matriz[x][y] = "*";
                }
                else{
                    matriz[x][y] = ".";
                }
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
