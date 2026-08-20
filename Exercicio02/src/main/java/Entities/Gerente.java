package Entities;

public class Gerente extends FuncionarioClt{

    private Integer tamanhoEquipe;
    private Double percentualBonus;

    public Gerente (){
        super();
    }

    public Gerente(String nome, String matricula, int salarioBase, String dataAdmissao,
                   Double valeTransporte, Double valeAlimentacao, Integer tamanhoEquipe, Double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    public Integer getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public void setTamanhoEquipe(Integer tamanhoEquipe) {
        this.tamanhoEquipe = tamanhoEquipe;
    }

    public Double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(Double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + tamanhoEquipe * percentualBonus;
    }

    @Override
    public double calcularDesconto() {
        if (tamanhoEquipe > 10){
            return super.calcularDesconto() + 50.0;
        }else{
            return super.calcularDesconto();
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "Equipe: "
                + tamanhoEquipe
                + " | Bônus: "
                + percentualBonus * 100
                + "%";
    }
}
