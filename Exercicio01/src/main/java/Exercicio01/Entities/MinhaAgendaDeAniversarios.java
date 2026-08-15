package Exercicio01.Entities;

import Exercicio01.Services.AgendaDeAniversarios;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes = new ArrayList<>();

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        aniversariantes.add(new Aniversariante(nome, dia, mes));
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> resultado = new ArrayList<>();
        for (Aniversariante a : aniversariantes) {
            if (a.getDataAniversario().getDia() == dia && a.getDataAniversario().getMes() == mes) {
                resultado.add(a.getNome());
            }
        }
        return resultado;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        aniversariantes.removeIf(a -> a.getNome().equals(nomeAniversariante));
    }
}