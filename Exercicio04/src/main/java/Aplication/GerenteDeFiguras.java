package Aplication;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {

    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras(){
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica fig){
        figuras.add(fig);
    }

    public List<FiguraGeometrica> getFiguras(){
        return figuras;
    }

    public double calcularAreaTotalDeFiguras(){
        double areaTotal = 0.0;
        for (FiguraGeometrica fig : figuras){
            areaTotal += fig.calculaArea();
        }
        return areaTotal;
    }

    public void imprimirFiguras(){
        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura(){
        double maiorArea = 0.0;
        for (FiguraGeometrica fig : figuras){
            if (maiorArea < fig.calculaArea()){
                maiorArea = fig.calculaArea();
            }
        }
        return maiorArea;
    }
}
