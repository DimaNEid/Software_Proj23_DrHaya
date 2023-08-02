package org.example;

public class User {


    public User() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    private String id;
    private static String name;
    private String username;
    private String password;


    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public static String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public User(String type, String id, String name, String username, String password) {
        this.type=type;
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString(){
        return '{'+ "type =" + type + '\''+
                ", id =" + id +
                ", name ='" + name + '\''+
                ", username =" + username + '\'' +
                ", password =" + password + '\'' + '}';
    }


}
