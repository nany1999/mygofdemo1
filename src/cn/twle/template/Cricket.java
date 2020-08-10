package cn.twle.template;

public class Cricket  extends Game {
     @Override
    void initialize() {
         System.out.println("Cricket Game Initialized! Start playing.");
     }
     void startPlay() {
         System.out.println("Cricket Game Started. Enjoy the game!");
     }
     void endPlay(){
         System.out.println("Cricket Game Finished!");
     }


}
