package cn.twle.flyweight;



public class Circle  implements Shape {
    private String  color;
    private int x,y,radius;
    public void circle(String color) {
        this.color = color;
    }
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }


}
