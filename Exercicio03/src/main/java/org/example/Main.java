package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do cd: ");
        System.out.print("Nome: ");
        String nomeCd = sc.nextLine();
        System.out.print("Preço: ");
        double precoCd = sc.nextDouble();
        System.out.print("Número de faixas: ");
        int numFaixas = sc.nextInt();

        System.out.println();
        System.out.println("Informe os dados do Livro: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String nomeLivro = sc.nextLine();
        System.out.print("Preço: ");
        double precoLivro = sc.nextDouble();
        System.out.print("Nome do autor: ");
        sc.nextLine();
        String autorLivro = sc.nextLine();

        CD cd = new CD(nomeCd, precoCd, numFaixas);
        Produto livro = new Livro(nomeLivro, precoLivro, autorLivro);


        System.out.println();
        System.out.println(cd.exibirInformacoes());
    }
}