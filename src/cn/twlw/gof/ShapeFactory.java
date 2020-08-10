package cn.twlw.gof;

public class ShapeFactory extends AbstractFactory{

    public  Shape getShape(String shapeType)
    {
      if(shapeType==null){
          return null;
      }
      if(shapeType.equalsIgnoreCase("Circle")){
          return new Circle();

      }
      if(shapeType.equalsIgnoreCase("Rectangle")){
          return new Rectangle();
      }else if(shapeType.equalsIgnoreCase("Square")){
          return new Square();
      }
      return null;
    }

    Color getColor(String color){
        return null;
    }


}
