package Entities;

public class Funcionario {
    private String nome;
    private String matricula;
    private Integer salarioBase;
    private String dataAdmissao;

    public Funcionario(){
    }

    public Funcionario(String nome, String matricula, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(String nome, String matricula, int salarioBase,
                       String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public double calcularSalario() {
        return salarioBase;
    }
    public double calcularDesconto() {
        return salarioBase * 0.08;
    }
    @Override
    public String toString() {
        return nome
                + " | "
                + matricula
                + " | "
                + salarioBase
                + " | "
                + dataAdmissao
                + " | ";
    }
}