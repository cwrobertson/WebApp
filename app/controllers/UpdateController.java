package controllers;

import models.UpdateModel;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import services.UpdateService;

/**
 * Created by a587853 on 06/04/2016.
 */
public class UpdateController extends Controller {

    public static Result displayMyUpdate() {
        return ok(views.html.updateuser.render());
    }

    public static Result updateMyAccount() {
        Form<UpdateModel> updateForm = Form.form(UpdateModel.class).bindFromRequest();
        if(updateForm.hasErrors()){
            flash("error", "Error While Updating User");
            return redirect(routes.UpdateController.displayMyUpdate());
        }
        Logger.info("Submit Update Query...");
        UpdateService updateService = new UpdateService();
        updateService.updateUser(updateForm);
        flash("success", "Successfully Updated! " + updateForm.get().getFirstname() +" " +  updateForm.get().getLastname());
        return redirect(routes.UpdateController.displayMyUpdate());
    }
}
