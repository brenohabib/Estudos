package atividade3.Prova1;

public class Location {
    int id;
    String tipoLocal;
    String pontoReferencia;
    int quantidadeQuarto;
    int quantidadeBanheiro;
    String bairro;
    String rua;
    int quadra;
    int lote;
    int numero;
    int quantidadeMaxHospede;
    int quantidadeCama;
    int quantidadeRecomentacao;

    public Location(int id, String tipoLocal, String pontoReferencia, int quantidadeQuarto, int quantidadeBanheiro,
                     String bairro, String rua, int quadra, int lote, int numero, int quantidadeMaxHospede,
                      int quantidadeCama, int quantidadeRecomentacao) {

        this.id = id;
        this.tipoLocal = tipoLocal;
        this.pontoReferencia = pontoReferencia;
        this.quantidadeQuarto = quantidadeQuarto;
        this.quantidadeBanheiro = quantidadeBanheiro;
        this.bairro = bairro;
        this.rua = rua;
        this.quadra = quadra;
        this.lote = lote;
        this.numero = numero;
        this.quantidadeMaxHospede = quantidadeMaxHospede;
        this.quantidadeCama = quantidadeCama;
        this.quantidadeRecomentacao = quantidadeRecomentacao;
    }

    public int getId() {
        return id;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public int getQuantidadeQuarto() {
        return quantidadeQuarto;
    }

    public int getQuantidadeBanheiro() {
        return quantidadeBanheiro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getQuadra() {
        return quadra;
    }

    public int getLote() {
        return lote;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantidadeMaxHospede() {
        return quantidadeMaxHospede;
    }

    public int getQuantidadeCama() {
        return quantidadeCama;
    }

}
