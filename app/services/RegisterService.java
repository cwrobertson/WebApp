package services;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import models.RegisterModel;
import play.data.Form;
import java.sql.Connection;
import java.sql.*;

/**
 * Created by a587853 on 25/03/2016.
 */
public class RegisterService {
    public static void registerUser(Form<RegisterModel> userModelForm) {

        Transaction transaction = Ebean.beginTransaction();
        try {
            Connection connection = transaction.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO REGISTER_MODEL(firstname, lastname, username, password) VALUES(?, ?, ?, ?)");
            ps.setString(1, userModelForm.get().getFirstname());
            ps.setString(2, userModelForm.get().getLastname());
            ps.setString(3, userModelForm.get().getUsername());
            ps.setString(4, userModelForm.get().getPassword());
            ps.execute();
            transaction.addModification("REGISTER_MODEL",false,true,false);
            Ebean.commitTransaction();
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            Ebean.endTransaction();
        }
    }

}
