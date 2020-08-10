package cn.twle.builder;

public class MealBuilder {


    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem( new VegBurger());
        meal.addItem(new Coca());
        return meal;

    }
    public Meal prepareNoVegMeal(){
        Meal meal1=new Meal();
        meal1.addItem(new ChickenBurger());
        meal1.addItem(new Pepsi() );
        return meal1;
    }
}
