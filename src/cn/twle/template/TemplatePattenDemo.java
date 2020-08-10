package cn.twle.template;

public class TemplatePattenDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        Game game1=new Footbal();
        game1.play();
        System.out.println();

    }
}
