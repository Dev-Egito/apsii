package Exercicio01.Entities;

import Exercicio01.Services.AgendaDeAniversarios;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private Aniversariante aniversariante;
    private DataAniversario dataAniversario;

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {

    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        return null;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {

    }
}
