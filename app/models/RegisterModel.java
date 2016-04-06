package models;

import play.data.validation.*;
import play.db.ebean.Model;
import javax.persistence.*;

/**
 * Created by a587853 on 22/03/2016.
 */

@Entity
public class RegisterModel extends Model {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Constraints.Required
    private String firstname;
    @Constraints.Required
    private String lastname;
    @Constraints.Required
    @Column(unique=true)
    private String username;
    @Constraints.Required
    @Constraints.MinLength(5)
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
