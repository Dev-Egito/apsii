package Entities;

public class FuncionarioClt extends Funcionario{
    private Double valeTransporte;
    private Double valeAlimentacao;

    public FuncionarioClt(){
        super();
    }

    public FuncionarioClt(String nome, String matricula, int salarioBase, String dataAdmissao, Double valeTransporte, Double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public Double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(Double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public Double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(Double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valeAlimentacao + valeTransporte;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50.0;
    }

    @Override
    public String toString() {
        return super.toString()
                + "VT: "
                + valeTransporte
                + " | VA: "
                + valeAlimentacao
                + " | ";
    }
}
