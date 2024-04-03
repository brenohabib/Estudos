package paradigmas.RPG;

public class Personagem {
<<<<<<< HEAD
    
    private String nome;
    private int vida;
    private int dano;
    
=======
   
    private String nome;
    private int vida;
    private int dano;
   
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
    public Personagem(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
<<<<<<< HEAD

    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - this.getDano());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}


=======
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " atacou " + alvo.getNome());
        alvo.setVida(alvo.getVida() - this.getDano());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        System.out.print(this.nome + " possui ");
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
}
>>>>>>> 71ec394de4f82774009413e6fbc6c13b6211ea41
