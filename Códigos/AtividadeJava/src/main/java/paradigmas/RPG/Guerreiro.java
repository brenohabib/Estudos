package paradigmas.RPG;

public class Guerreiro extends Personagem{

    private int armadura;
    private boolean inFuria = false;

    public Guerreiro(String nome, int vida, int dano, int armadura) {
        super(nome, vida, dano);
        this.armadura = armadura;
<<<<<<< HEAD

    }

=======
    }
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
    public void turnFuria() {
        if (!inFuria) {
            inFuria = true;
            this.setDano(getDano() * 2);
            this.setVida(getVida() - 10);
        } else {
            inFuria = false;
            this.setDano(getDano() / 2);
            this.setVida(getVida() + 15);
        }
    }
<<<<<<< HEAD

    public void lacerar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - this.getDano() * 5);
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

}
=======
    public void lacerar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - this.getDano() * 5);
    }
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    public boolean isInFuria() {
        return inFuria;
    }
    public void setInFuria(boolean inFuria) {
        this.inFuria = inFuria;
    } 
}
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
