package controllers;

import models.RegisterModel;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import services.RegisterService;
import views.html.register;

/**
 * Created by a587853 on 25/03/2016.
 */
public class RegisterController extends Controller {

    public static Result displayRegister() {
        Logger.info("Loading Register Page...");
        Form<RegisterModel> registerForm =  Form.form(RegisterModel.class);
        return ok(register.render(registerForm));
    }

    public static Result doRegister() {
        Form<RegisterModel> registerForm = Form.form(RegisterModel.class).bindFromRequest();
        Logger.info("Submit Register Query...");
        if(registerForm.hasErrors()){
            flash("error", "Error While Registering User");
            return redirect(routes.RegisterController.displayRegister());
        }
        else {
                RegisterService registerService = new RegisterService();
                registerService.registerUser(registerForm);
                flash("success", "Successfully Registered! Welcome " + registerForm.get().getFirstname() +" " +  registerForm.get().getLastname());
                return redirect(routes.Application.index());
        }
    }
}
