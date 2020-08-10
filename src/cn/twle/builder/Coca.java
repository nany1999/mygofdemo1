package cn.twle.builder;

public class Coca extends ColdDrink {
    @Override
    public Float price(){
        return 3f;
    }
    @Override
    public String name(){
        return "COCA COLA";
    }
}
