package cn.twle.proxy;

public class ProxyPatterDemo {
    public static void main(String[] args) {
        Image image=new ProxyImage("WechatIMG756.png");
        image.display();
        System.out.println();

        image.display();

    }
}
