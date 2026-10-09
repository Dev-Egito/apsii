import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        double valorTotal = 0;
        int pontosDeAlugadorFrequente = 0;
        StringBuilder resultado = new StringBuilder();

        resultado.append("Registro de Alugueis de ")
                 .append(getNome())
                 .append("\n");

        for (Aluguel aluguel : alugueis) {
            resultado.append("\t")
                     .append(aluguel.getFita().getTitulo())
                     .append("\t")
                     .append(aluguel.getValor())
                     .append("\n");

            valorTotal += aluguel.getValor();
            pontosDeAlugadorFrequente += aluguel.getPontos();
        }

        resultado.append("Valor total devido: ")
                 .append(valorTotal)
                 .append("\n");
        resultado.append("Você ganhou ")
                 .append(pontosDeAlugadorFrequente)
                 .append(" pontos de alugador frequente");

        return resultado.toString();
    }
}
