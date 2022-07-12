package tsi.assinaturapacotes;

public class Pacote {
    private String descricao;
    private Double valor;

    public Pacote(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao+ ": R$ " + valor;
    }
    
    
}
