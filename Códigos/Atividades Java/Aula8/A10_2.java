import java.util.Scanner;

public class A10_2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int tam = 0, start = 0 ;

        do{
            System.out.println("Tamanho da matriz,");
            tam = ler.nextInt();

            if (tam % 2 == 0){
                System.out.println("O tamanho deve ser impar, tente novamente.");
            } else if ( tam < 1){
                System.out.println("O tamanho deve ser maior que 0, tente novamente.");
            }
        } while (tam % 2 == 0 || tam < 1);

        int matriz[][] = new int[tam][tam];

       
        start = (tam + 1) / 2;



        int linha = start - 1, coluna = start - 1;
        int n1=0,n2=1,n3, cont = 0;
        boolean esquerda = false, direita = true, cima = false, baixo = false;
        int movimento = 1;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                
                if (cont == 0){
                    matriz[linha][coluna] = n1;
                } else if ( cont == 1){
                    matriz[linha][coluna] = n2;
                } else{
                    n3 = n1 + n2;
                    matriz[linha][coluna] = n3;
                    n1=n2;    
                    n2=n3; 
                }

                if (esquerda == true){
                    for (int k = 0; k != movimento; k++){
                        coluna -= 1;
                    }
                    esquerda = false;
                    baixo = true;
                } else if (direita == true) {
                    for (int k = 0; k != movimento; k++){
                        coluna += 1;
                    }
                    direita = false;
                    cima = true;
                } else if (cima == true) {
                    for (int k = 0; k != movimento; k++){
                        linha -= 1;
                    }
                    cima = false;
                    esquerda = true;
                } else if (baixo == true) {
                    for (int k = 0; k != movimento; k++){
                        linha += 1;
                    }
                    baixo = false;
                    direita = true;
                }
                
                cont += 1;
                
                if(cont % 2 == 0 && cont != 0){
                    movimento +=1;
                }
            }

        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" | " + matriz[i][j]); 
         
            }
            System.out.println(" | ");
        }

        ler.close();
    }
    
}

//Preencha uma Matriz quadrada com Fibonacci iniciando do centro da matriz preencho
//ela de modo a formar o padrão em espiral.
