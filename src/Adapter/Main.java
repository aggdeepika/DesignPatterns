package Adapter;

public class Main {

    public static void main (String args[]){
        System.out.println("We are in Adapter pattern");

        Duck duck=new MallardDuck(); // Duck Objects
        Turkey turkey=new WildTurkey();

        //

        Duck turkeyAdapter =new TurkeyAdapter(turkey);

        System.out.println(" The Duck Says....");
        duck.quack();
        duck.fly();

        System.out.println(" The Turkey Says....");
        turkey.gobble();
        turkey.fly();

        System.out.println(" The Turkey Adapter Says....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();







    }
}
