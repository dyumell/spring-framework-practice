package bibliothecadyumellis.spring.core.bean;

public class User {
    private String userID;
    private String name;

    public void setUserID(String userID) {
        this.userID =userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID(){
        return this.userID;
    }

    public String getName(){
        return this.name;
    }
}
