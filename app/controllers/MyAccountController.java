package controllers;

import models.UpdateModel;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import services.MyAccountService;
import services.UpdateService;
import views.html.MyAccount;

/**
 * Created by a587853 on 04/04/2016.
 */
public class MyAccountController extends Controller {
    public static Result displayMyAccount() {
        Logger.info("Loading My Account Page...");
        Form<UpdateModel> updateForm = Form.form(UpdateModel.class);
        MyAccountService accountService = new MyAccountService();
        return ok(views.html.MyAccount.render(accountService.getFirstName(),accountService.getLastName(), accountService.getUserName(), accountService.getPassword()));
    }
}
