package cn.twle.builder;

public class VegBurger  extends Burger{
    @Override
    public Float price(){
        return 23f;
    }
    @Override
    public String name(){
        return  "Veg Burger";
    }
}
