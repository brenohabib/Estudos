package ex02;

import java.util.Vector;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resposta; 
        Vector<Integer> vet = new Vector<>(15);
        for(int i = 0; i < vet.capacity(); i++){ 
            vet.add((int)(Math.random()*50));
            
            for(int j = 0; j < i; j++){
                while(vet.lastElement().equals(vet.elementAt(j))){
                    vet.setElementAt((int)(Math.random()*50), i);
                }
            }
            

        }
        while(true){
            resposta = input.nextInt();
            if(resposta <0 || resposta >50){
                System.out.println("Resposta inválida! Tente novamente: ");
            }
            if(vet.contains(resposta)){
                System.out.println("O vetor possui o valor " + resposta + " Na posição " + (vet.indexOf(resposta)+1));
                break;
            }
            else{
                System.out.println("O vetor não possui o valor " + resposta);
                break;
            }

        }
        System.out.print("vetor: ");
        for(int i = 0; i < 15; i++){ 
            System.out.print(" |" + vet.get(i));;
        }
        
        input.close();
    }
}
