package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by a587853 on 01/04/2016.
 */
public class LogoutController extends Controller {
    public static Result logout()
    {
        session().remove("user");
        return redirect(routes.Application.index());
    }
}
