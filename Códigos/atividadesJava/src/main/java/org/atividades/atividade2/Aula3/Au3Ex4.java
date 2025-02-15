package atividade2.Aula3;

public class Au3Ex4 {
    public static void main(String[] args) {
        System.out.println(vetificarPalindromo("ovo"));
    }
    public static boolean vetificarPalindromo(String palavra) {
        String aux = "";
        for(int i = palavra.length()-1; i >= 0; i--){
            aux += palavra.charAt(i);
        }
        if (palavra.equals(aux)){
            return true;
        }
        else{
            return false;
        }
    }
}
