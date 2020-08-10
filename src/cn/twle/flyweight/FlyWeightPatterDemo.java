package cn.twle.flyweight;

public class FlyWeightPatterDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=1;i<20;i++){
            Circle circle= new Circle();
            //Shape ss1 = ShapeFactory.getCircle(getRandomColor());
             circle.circle(getRandomColor());
            circle.setx(getRandomX());
            circle.sety(getRandomY());
            circle.setRadius(100);
            circle.draw();

        }


    }
    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
    private static int getRandomX(){
        return (int) (Math.random()*100);
    }
    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
}
