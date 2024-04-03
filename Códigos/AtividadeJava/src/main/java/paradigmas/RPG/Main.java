package paradigmas.RPG;

public class Main {
    public static void main(String[] args) {
        Mago maria = new Mago("Maria Giovanna", 200, 20, 400);
        Guerreiro marcio = new Guerreiro("Marcio Henrique", 500, 30, 50);
        System.out.println(maria.getVida() + " de vida");
        marcio.atacar(maria);
        System.out.println(maria.getVida() + " de vida");
        
        System.out.println(marcio.getVida() + " de vida");
        maria.castBolaDeFogo(marcio);
        System.out.println(marcio.getVida() + " de vida");
    }
}
