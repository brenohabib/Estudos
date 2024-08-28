package atividade3.Prova1;

public class Client {

    int id;
    String nome;
    String endereco;
    int idade;
    String sexo;
    String preferencia_estadia;

    public Client(int id, String nome, String endereco, int idade,String sexo, String preferencia_estadia) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
        this.preferencia_estadia = preferencia_estadia;
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public String getPreferencia_estadia() {
        return preferencia_estadia;
    }
}
