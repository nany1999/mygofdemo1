package cn.twle.single;
//懒汉模式
//public class SingleObject {
//    private static SingleObject instance;
//     private SingleObject(){
//
//     }
//
//     public static SingleObject getInstance (){
//         if(instance==null){
//             instance =new SingleObject();
//         }
//         return instance;
//
//     }
//     public void ShowMessage(){
//         System.out.println("hello,world") ;
//     }
//
//
//}
//枚举模式
//public enum SingleObject {
//    INSTANCE;
//    public void whateverMethod() {
//    }
//    public void ShowMessage(){
//         System.out.println("hello,world") ;
//     }
//}
//饿汉模式
public class SingleObject
{
    private static SingleObject instance = new SingleObject();
    private SingleObject (){}
    public static SingleObject getInstance() {
        return instance;
    }
    public void ShowMessage(){
        System.out.println("hello,world") ;
    }
}


