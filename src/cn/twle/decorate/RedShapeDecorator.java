package cn.twle.decorate;

public class RedShapeDecorator  extends ShapeDecorator{
    public RedShapeDecorator(Shape decorateShape ){
        super(decorateShape );
    }
    @Override
    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);

    }
    private  void setRedBorder(Shape decorateShape){
        System.out.println("Border Color: Red");
    }
}
