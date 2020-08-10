package cn.twlw.gof;

import static cn.twlw.gof.ShapeFactory.*;

public class AbstractFactoryPatternDemo {
    public  static void main(String[] args){
        AbstractFactory shapeFactory=FactoryProducer.getFactory( "Shape") ;
        Shape sp1= shapeFactory.getShape("Circle");
        sp1.draw();
        Shape sp2= shapeFactory.getShape("Rectangle");
        sp2.draw();
        Shape sp3= shapeFactory.getShape("Square");
        sp3.draw();

        AbstractFactory  colorFactory=FactoryProducer.getFactory("Color");
        Color col1=colorFactory.getColor("Red");
        col1.fill();
        Color col2=colorFactory.getColor("Blue");
        col2.fill();
        Color col3=colorFactory.getColor("Yellow");
        col3.fill();




    }
}
