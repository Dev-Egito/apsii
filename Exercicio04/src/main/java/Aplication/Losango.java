package Aplication;

public class Losango implements FiguraGeometrica {

    private Double diagonal1;
    private Double diagonal2;

    public Losango(Double diagonal1, Double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculaArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Losango";
    }

    @Override
    public String toString() {
        return "\nDados do Losangolo: "
                + "\nDiagonal 1= " + diagonal1
                + "\nDiagonal 2= " + diagonal2;
    }
}
