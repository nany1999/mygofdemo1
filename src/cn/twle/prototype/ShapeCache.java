package cn.twle.prototype;

import java.util.Hashtable;

public class ShapeCache  {
    private static Hashtable<String,Shape> shapemap=new Hashtable<String,Shape>();

    public  static  Shape getShape(String shapeId){
        Shape shapecache=shapemap.get(shapeId);
        return (Shape) shapecache.Clone();


    }
     public static void loadcache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapemap.put(circle.getId(),circle);
        Square square=new Square();
         square.setId("2");
        shapemap.put(square.getId(),square);
        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapemap.put(rectangle.getId(),rectangle);


     }


}
