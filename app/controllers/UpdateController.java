package controllers;

import models.UpdateModel;
import models.UserModel;
import play.Logger;
import play.api.mvc.Session;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import services.MyAccountService;
import services.UpdateService;
import views.html.updateuser;

/**
 * Created by a587853 on 06/04/2016.
 */
public class UpdateController extends Controller {

    public static Result displayMyUpdate() {
        Form<UpdateModel> updateForm =  Form.form(UpdateModel.class);
        MyAccountService accountService = new MyAccountService();
        return ok(updateuser.render(updateForm, accountService.getFirstName(),accountService.getLastName(), accountService.getUserName(), accountService.getPassword() ));
    }

    public static Result updateMyAccount() {
        Form<UpdateModel> updateForm = Form.form(UpdateModel.class).bindFromRequest();
        if(updateForm.hasErrors()){
            flash("error", "Error While Updating User");
            return redirect(routes.UpdateController.displayMyUpdate());
        }
        Logger.info("Submit Update Query...");
        UpdateService updateService = new UpdateService();
        if(updateService.updateUser(updateForm)){
            flash("success", "Successfully Updated! " + updateForm.get().getFirstname() +" " +  updateForm.get().getLastname());
            session("user", updateForm.get().getUsername());
            return redirect(routes.UpdateController.displayMyUpdate());
        }
        flash("error", "Error While Updating User");
        return redirect(routes.UpdateController.displayMyUpdate());
    }
}
