package Entities;

public class Estagiario extends Funcionario{

    private int valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, int salarioBase,
                      String dataAdmissao, int valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public int getValorBolsaAuxilio() {
        return valorBolsaAuxilio;
    }

    public void setValorBolsaAuxilio(int valorBolsaAuxilio) {
        this.valorBolsaAuxilio = valorBolsaAuxilio;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        return valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Bolsa: "
                + valorBolsaAuxilio
                + " | Carga Horária: "
                + cargaHorariaSemanal;
    }
}
