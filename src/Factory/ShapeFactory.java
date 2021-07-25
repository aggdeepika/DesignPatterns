package Factory;

import java.awt.*;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
         else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectange();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }


        return null;
    }
}
