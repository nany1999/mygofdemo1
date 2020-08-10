package cn.twle.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static HashMap<String, Shape> shapes=new HashMap();
    public  static Shape getCircle(String color){
        Circle  circle = (Circle)shapes.get(color);
        if(circle==null){
            shapes.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }

}
