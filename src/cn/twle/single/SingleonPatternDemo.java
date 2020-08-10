package cn.twle.single;

public class SingleonPatternDemo {
    public static void main(String[] args) {
        //SingleObject sb=SingleObject.getInstance();
        SingleObject sb=SingleObject.getInstance();
        sb.ShowMessage();
    }
}
