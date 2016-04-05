package services;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import models.UserModel;
import play.data.Form;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by a587853 on 23/03/2016.
 */
public class LoginService {
    public boolean verifyLogin(Form<UserModel> loginForm)
    {
        Transaction transaction = Ebean.beginTransaction();
        try {
            Connection connection = transaction.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * from REGISTER_MODEL WHERE USERNAME = ? AND PASSWORD = ? ");
            ps.setString(1, loginForm.get().getUsername());
            ps.setString(2, loginForm.get().getPassword());
            ResultSet rs = ps.executeQuery();
            boolean rowNumber = rs.last();
            if(rowNumber == true){
                transaction.addModification("REGISTER_MODEL",false,true,false);
                Ebean.commitTransaction();
                Ebean.endTransaction();
                return true;

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Ebean.endTransaction();
        }
        return false;
    }
}
