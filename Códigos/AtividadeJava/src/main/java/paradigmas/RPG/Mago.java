package paradigmas.RPG;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int vida, int dano, int mana) {
        super(nome, vida, dano);
        this.mana = mana;
    }
<<<<<<< HEAD

=======
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
    @Override
    public void atacar(Personagem alvo) {
        if (mana >= 10) {
            alvo.setVida(alvo.getVida() - this.getDano() * 2);
            mana -= 10;
        } else {
            super.atacar(alvo);
        }
<<<<<<< HEAD
    }

=======
        System.out.println(super.getNome() + " atacou " + alvo.getNome());
    }
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
    public void castBolaDeFogo(Personagem alvo) {
        if (mana >= 30) {
            alvo.setVida(alvo.getVida() - this.getDano() * 5);
            mana -= 30;
        }
<<<<<<< HEAD
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
=======
        System.out.println(super.getNome() + " lançou bola de fogo em " + alvo.getNome());
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
