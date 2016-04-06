package services;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import controllers.LoginController;
import models.UserModel;
import play.data.Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by a587853 on 04/04/2016.
 */
public class MyAccountService {
    public String getFirstName(){
        Transaction transaction = Ebean.beginTransaction();
        try {
            Connection connection = transaction.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT FIRSTNAME from REGISTER_MODEL WHERE USERNAME = ?");
            ps.setString(1, LoginController.session("user"));
            ResultSet rs = ps.executeQuery();
            rs.last();
            String name = rs.getString(1);
            return name;


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            Ebean.endTransaction();
        }
        return null;
    }

    public String getLastName(){
        Transaction transaction = Ebean.beginTransaction();
        try {
            Connection connection = transaction.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT LASTNAME from REGISTER_MODEL WHERE USERNAME = ?");
            ps.setString(1, LoginController.session("user"));
            ResultSet rs = ps.executeQuery();
            rs.last();
            String name = rs.getString(1);
            return name;


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            Ebean.endTransaction();
        }
        return null;
    }

    public String getUserName(){
        Transaction transaction = Ebean.beginTransaction();
        try {
            Connection connection = transaction.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT USERNAME from REGISTER_MODEL WHERE USERNAME = ?");
            ps.setString(1, LoginController.session("user"));
            ResultSet rs = ps.executeQuery();
            rs.last();
            String name = rs.getString(1);
            return name;


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            Ebean.endTransaction();
        }
        return null;
    }
    public String getPassword(){
        Transaction transaction = Ebean.beginTransaction();
        try {
            Connection connection = transaction.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT PASSWORD from REGISTER_MODEL WHERE USERNAME = ?");
            ps.setString(1, LoginController.session("user"));
            ResultSet rs = ps.executeQuery();
            rs.last();
            String name = rs.getString(1);
            return name;


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            Ebean.endTransaction();
        }
        return null;
    }

}
