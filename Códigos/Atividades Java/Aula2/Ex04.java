public class Ex04 {
    public static void main(String[] args) {
        int [] vetA = new int[10];
        int [] vetB = new int[vetA.length];
        for(int i = 0; i < vetA.length;i++){
            vetA[i] = (int)(Math.random()*10);
            vetB[i] = (int)(Math.pow(vetA[i], 2)); 
            System.out.println("valor: "+vetA[i] + " valor ao quadrado: "+ vetB[i]);
        }
        
    }
}
