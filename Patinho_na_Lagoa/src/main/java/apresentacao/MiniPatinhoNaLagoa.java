package apresentacao;

import patos.Duck;
import patos.MallardDuck;
import patos.ModelDuck;
import voos.FlyRocketPowered;

public class MiniPatinhoNaLagoa {
    public static void main(String[] args){

        Duck mallard = new MallardDuck();
        mallard.peformFly();
        mallard.peformQuack();

        System.out.println("-----------------------------------------");

        Duck model = new ModelDuck();
        model.peformFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.peformFly();
    }
}
