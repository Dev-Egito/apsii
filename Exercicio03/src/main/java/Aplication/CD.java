package Aplication;

public class CD extends Produto implements InfoGeriais{
    private Integer numFaixas;

    public CD(String nome, Double preco, Integer numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    public Integer getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(Integer numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public String exibirInformacoes() {
        return "Informações  do CD: "
                + "\nNome: " + getNome()
                + "\nPreço: " + getPreco()
                + "\nNúmeros de faixa: " + getNumFaixas();
    }
}
