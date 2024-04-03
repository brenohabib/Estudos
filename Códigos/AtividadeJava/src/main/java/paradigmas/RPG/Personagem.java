package paradigmas.RPG;

public class Personagem {
   
    private String nome;
    private int vida;
    private int dano;
   
    public Personagem(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }
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
