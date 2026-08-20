package Entities;

public class Veiculo {

    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String imprimirDetalhes(){
        return "\nModelo: " + this.modelo + "\nAno: " + this.ano;
    }
}