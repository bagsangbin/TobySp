package org.example;



public class User {
    String id;
    String name;
    String password;

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }

}
