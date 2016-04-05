package models;

import play.db.ebean.Model;

/**
 * Created by a587853 on 01/04/2016.
 */
public class UserModel extends Model {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
