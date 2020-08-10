package cn.twlw.gof;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String  shapeType){
        return null;
    }
    @Override
    Color getColor(String color){
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }else if(color.equalsIgnoreCase("Blue")){
            return  new Blue();
        }else if(color.equalsIgnoreCase("Yellow")){
            return new Yellow();
        }
         return null;
    }
}
