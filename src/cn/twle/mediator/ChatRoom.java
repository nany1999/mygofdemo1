package cn.twle.mediator;


import java.util.*;

public class ChatRoom {
    public static void showMessage(User user,String message){
         Date date = new Date();
        System.out.println( date.toString()+"\n"+ user.getUseName().concat("123") +":"+message);

    }
}
