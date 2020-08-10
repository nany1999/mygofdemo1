package cn.twle.mediator;

public class User {
    private String username;
    public  User(String username ){
        this.username = username;

    }
    public  String getUseName( ){
      return username;
    }
    public void setUserName( String username){
        this.username = username;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage( this,message);
    }

}
