package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

import java.sql.SQLOutput;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public abstract void display();

    public void peformFly(){
        flyBehavior.fly();
    }

    public void peformQuack(){
        quackBehavior.quack();
    }

    public void swin(){
        System.out.println("All ducks float, even decoys!");
    }
}
