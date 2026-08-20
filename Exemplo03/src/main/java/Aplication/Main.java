package Aplication;

import Entities.Carro;
import Entities.Moto;
import Entities.Veiculo;

public class Main {
    public static void main(String[] args){

        Veiculo veiculo = new Veiculo("Civic ",2025);
        Carro carro = new Carro("Corola", 2026, 4);
        Moto moto = new Moto("Ninja2000", 2026, 400);

        System.out.println(veiculo.imprimirDetalhes());
        System.out.println(carro.imprimirDetalhes());
        System.out.println(moto.imprimirDetalhes());
    }
}
