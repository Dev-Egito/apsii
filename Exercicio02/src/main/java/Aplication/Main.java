package Aplication;

import Entities.*;

public class Main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");
        Funcionario fun2 = new FuncionarioClt("Bruno Reis", "C001", 3000, "10/06/2021", 220.0, 400.0);
        Funcionario fun3 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300.0, 500.0, 12, 0.20);
        Funcionario fun4 = new Estagiario("Diego Alves", "E001", 0, "05/08/2024 ", 1500, 20);
        Funcionario fun5 = new Gestor("Matheus Egito", "GS001", 10000, "15/01/2018", 300.0, 500.0, 12, 0.20, 1000.0);

        System.out.println("Funcionario: \n" + fun1);
        System.out.println("Funcionario CLT: \n" + fun2);
        System.out.println("Gerente: \n" + fun3);
        System.out.println("Estagiario: \n" + fun4);
        System.out.println("Gestor: \n" + fun5);


    }
}
