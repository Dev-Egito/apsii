package Aplication;

public class ProgramaDasFiguras {
    public static void main(String[] args) {

        GerenteDeFiguras gerente = new GerenteDeFiguras();
        Triangulo t1 = new Triangulo(2.0,3.0);
        Losango l1 = new Losango(3.0, 4.0);
        Losango l2 = new Losango(2.5, 5.0);

        gerente.adicionaFigura(t1);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        gerente.imprimirFiguras();
        System.out.println("Área Total: " + gerente.calcularAreaTotalDeFiguras());
    }
}