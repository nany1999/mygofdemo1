package cn.twle.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User miaodambao = new User("miaodabao");
        User nanmimi = new User("nanmimi");
        nanmimi.sendMessage("hello,nantiantain");
        miaodambao.sendMessage("I like fish");



    }
}
