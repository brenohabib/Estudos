package atividade.Aula3;

/*Crie em java um programa que contenha um vetor de 10 posições do tipo String. O vetor será
preenchido pelo usuário. Após o vetor preenchido, substitua todas as vogais ''a'' pelo valor 0,
''e'' pelo valor 1, ''i'' pelo valor 2, ''o'' pelo valor 3, ''u'' pelo valor 4. */
import java.util.Scanner;
public class Au3Ex4 {
    public static void main(String[] args) {
        String[] vec = new String[10];
        int[] soma = new int[10];
        String vogais = "aeiouAEIOU";
        Scanner input = new Scanner(System.in);
        int cont = 0;

        for(int i = 0; i < vec.length; i++){

            System.out.print("Digite a palavra #"+ (i+1) + ": ");
            vec[i] = input.nextLine();
            for(int j = 0;j < vec[i].length(); j++){

                char identificadorVogal = vec[i].charAt(j);

                if(vogais.contains(String.valueOf(identificadorVogal))){
                    if(identificadorVogal == 'a'){
                        vec[i] = vec[i].replace('a', '0');
                    }
                    if(identificadorVogal == 'e'){
                        vec[i] = vec[i].replace('e', '1');
                    }
                    if(identificadorVogal == 'i'){
                        vec[i] = vec[i].replace('i', '2');
                    }
                    if(identificadorVogal == 'o'){
                        vec[i] = vec[i].replace('o', '3');
                    }
                    if(identificadorVogal == 'u'){
                        vec[i] = vec[i].replace('u', '4');
                    }
                }
            }
            soma[i] = cont;
            cont = 0;
        }

        for(int i = 0; i< vec.length;i++){
            System.out.println("\nA palavra trocada: "+ vec[i]);
        }
        
        input.close();
    }
}