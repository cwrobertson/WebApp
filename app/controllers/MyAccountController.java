package controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import services.MyAccountService;

/**
 * Created by a587853 on 04/04/2016.
 */
public class MyAccountController extends Controller {
    public static Result displayMyAccount() {
        Logger.info("Loading My Account Page...");
        MyAccountService accountService = new MyAccountService();
        return ok(views.html.MyAccount.render(accountService.getFirstName(),accountService.getLastName(), accountService.getUserName()));
    }
}
