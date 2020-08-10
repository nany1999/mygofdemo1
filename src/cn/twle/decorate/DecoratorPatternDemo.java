package cn.twle.decorate;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape redCirle= new RedShapeDecorator(new Circle());
        Shape redrectangle= new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Circle with red border");
        redCirle.draw();
        System.out.println("rectangle with red border");
        redrectangle.draw();

    }


}
