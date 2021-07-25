package Decorator;

public abstract class ShapeDecorator  implements  IShape{

    protected IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

   public void draw(){
        decoratedShape.draw();
   }

}
