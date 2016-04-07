package services;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import controllers.LoginController;
import models.UpdateModel;
import play.data.Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by a587853 on 06/04/2016.
 */
public class UpdateService {
        public static Boolean updateUser(Form<UpdateModel> userModelForm) {
        Transaction transaction = Ebean.beginTransaction();
        try {
        Connection connection = transaction.getConnection();
        PreparedStatement ps = connection.prepareStatement("UPDATE REGISTER_MODEL SET FIRSTNAME = ?, LASTNAME = ?, USERNAME = ?, PASSWORD = ? WHERE USERNAME = ? ");
        ps.setString(1, userModelForm.get().getFirstname());
        ps.setString(2, userModelForm.get().getLastname());
        ps.setString(3, userModelForm.get().getUsername());
        ps.setString(4, userModelForm.get().getPassword());
            ps.setString(5, LoginController.session("user"));
        ps.execute();
        transaction.addModification("REGISTER_MODEL",false,true,false);
        Ebean.commitTransaction();
                return true;
        } catch (SQLException e) {
        e.printStackTrace();

        } finally {
        Ebean.endTransaction();
        }
                return false;
        }

}
