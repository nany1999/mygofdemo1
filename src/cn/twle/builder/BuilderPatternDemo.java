package cn.twle.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder meal_Builder= new MealBuilder();
        Meal meal= meal_Builder.prepareVegMeal();
         System.out.println("肉汉堡");
         System.out.println("肉汉堡价格:"+ meal.getCost());
         meal.showItems();
         Meal nomeal=meal_Builder.prepareNoVegMeal();
          System.out.println("素汉堡");
          System.out.println("素汉堡价格："+ nomeal.getCost());
          nomeal.showItems();

    }

}
