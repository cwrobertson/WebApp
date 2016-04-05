package controllers;

import models.UserModel;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import services.LoginService;
import views.html.login;

/**
 * Created by a587853 on 23/03/2016.
 */
public class LoginController extends Controller {

    public static Result displayLogin() {
        Logger.info("Loading Login Page...");
        Form<UserModel> userForm =  Form.form(UserModel.class);
        return ok(login.render(userForm));
    }
    public static Result postLogin() {
        Form<UserModel> loginForm = Form.form(UserModel.class).bindFromRequest();
        Logger.info("Submit Login Query...");
        if(loginForm.hasErrors()){
            flash("error", "Invalid login");
            return redirect(routes.LoginController.displayLogin());
        }
        else{
            LoginService loginService = new LoginService();
            if(loginService.verifyLogin(loginForm))
            {
                session("user", loginForm.get().getUsername());
                flash("success", "Welcome " +loginForm.get().getUsername());
                return redirect(routes.Application.index());
            }
            else
            {
                flash("error", "Invalid login");
                return redirect(routes.LoginController.displayLogin());
            }
        }
    }
}
