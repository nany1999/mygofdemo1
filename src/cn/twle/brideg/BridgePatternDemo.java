package cn.twle.brideg;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape   redcircle= new Circle(100,100,100, new RedCircle());
        Shape greencircle= new Circle(200,200,200,new GreenCircle());
        redcircle.draw();
        greencircle.draw();
    }
}
