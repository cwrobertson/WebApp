package controllers;

import play.Logger;
import play.mvc.*;

public class Application extends Controller {
  public static Result index()  {
    Logger.info("Loading Index Page...");
    return ok(views.html.index.render());
  }
  public static Result java() {
    Logger.info("Loading Java Page...");
    return ok(views.html.JavaPage.render());
  }
  public static Result scala() {
    Logger.info("Loading Scala Page...");
    return ok(views.html.ScalaPage.render());
  }
  public static Result groovy() {
    Logger.info("Loading Groovy Page..." + LoginController.session("user"));
    return ok(views.html.GroovyPage.render());
  }
  public static Result python() {
    Logger.info("Loading Python Page...");
    return ok(views.html.PythonPage.render());
  }
  public static Result ruby() {
    Logger.info("Loading Ruby Page...");
    return ok(views.html.RubyPage.render());
  }
}
