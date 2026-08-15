package Exercicio01.Aplication;

import Exercicio01.Entities.Aniversariante;
import Exercicio01.Entities.DataAniversario;
import Exercicio01.Entities.MinhaAgendaDeAniversarios;

public class Main {
    public static void main(String[] args) {
        Aniversariante a1 = new Aniversariante("Raul", 10, 5);
        Aniversariante a2 = new Aniversariante("Raul", new DataAniversario(10, 5));
        Aniversariante a3 = new Aniversariante("Matheus", 20, 8);

        System.out.println("equals (esperado true): " + a1.equals(a2));
        System.out.println("equals (esperado false): " + a1.equals(a3));

        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
        agenda.adicionarAniversariante("Raul", 10, 5);
        agenda.adicionarAniversariante("Matheus", 20, 8);
        agenda.adicionarAniversariante("Yngrid", 10, 5);

        System.out.println("Aniversariantes em 10/5: " + agenda.obterAniversariantesDoDia(10, 5));
        agenda.removerAniversariante("Matheus");
        System.out.println("Após remover Matheus, em 20/8: " + agenda.obterAniversariantesDoDia(20, 8));
    }
}
