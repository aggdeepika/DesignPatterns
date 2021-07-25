package Decorator;

public class Main {

    public static void main(String args[]){
        IShape circle= new Circle();
        IShape redColourCircle= new RedShapeDecorator(circle);

        circle.draw();
        redColourCircle.draw();
    }
}
