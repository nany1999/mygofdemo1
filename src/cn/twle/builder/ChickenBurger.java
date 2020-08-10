package cn.twle.builder;

public class ChickenBurger  extends Burger{
    @Override
    public Float price(){
        return 60f;
    }
    @Override
    public String name(){
        return  "ChickenBurger";
    }
}
