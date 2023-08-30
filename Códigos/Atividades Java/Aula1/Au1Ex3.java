

public class Au1Ex3{
    public static void main(String[] args) {
         
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int imp = 0;
        int par = 0;
        int soma = 0;
        for(int i = 0; i < num.length; i++){
            soma = soma + num[i];
            if(i % 2 != 0){
                par = par + num[i];
            }
            else{
                imp = imp + num[i];
            }
        }
        System.out.println(soma);
        System.out.println(imp);
        System.out.println(par);
       



    }
}