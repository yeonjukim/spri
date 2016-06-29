package hello.models;

import javax.persistence.*;

/**
 * Created by yeonju on 2016-06-29.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String password;

    public User(String id, String password, String name){
        this.id = id;
        this.password = password;
        this.name = name;
    }
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
