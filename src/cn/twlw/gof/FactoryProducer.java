package cn.twlw.gof;

public class FactoryProducer {
    public static AbstractFactory getFactory(String Choice){
        if(Choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }else if(Choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
