package Entities;

public class Gestor extends Gerente{

    private double participacaoLucros;

    public Gestor(String nome, String matricula, int salarioBase, String dataAdmissao, Double valeTransporte,
                  Double valeAlimentacao, Integer tamanhoEquipe, Double percentualBonus, double participacaoLucros) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus);
        this.participacaoLucros = participacaoLucros;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + participacaoLucros;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Participação Lucros: "
                + participacaoLucros;
    }
}
