package cn.twle.template;

public class Footbal  extends Game {

    @Override
    void initialize() {
        System.out.println("Football Game Initialized");
    }
    @Override
    void startPlay(){
        System.out.println("enjoy football game1");
    }
    @Override
    void endPlay() {
        System.out.println(" football game is finished");
    }
}
