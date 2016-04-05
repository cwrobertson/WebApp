
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[RegisterModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[RegisterModel]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.33*/("""
"""),_display_(/*2.2*/main("Register Page")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    """),format.raw/*3.5*/("""<div class="registerForm">
        <form class="form-horizontal" role="form" method="post" action=""""),_display_(/*4.74*/routes/*4.80*/.RegisterController.doRegister()),format.raw/*4.112*/("""">
            <div class="form-group">
                <label for="firstname">Firstname:</label>
                <input type="text" class="form-control" name="firstname" required>
            </div>
            <div class="form-group">
                <label for="lastname">Lastname:</label>
                <input type="text" class="form-control" name="lastname" required>
            </div>
            <div class="form-group">
                <label for="usr">Username:</label>
                <input type="text" class="form-control" name="username" required>
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" name="password" required>
            </div>
            <div class="button">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
""")))}))}
  }

  def render(userForm:Form[RegisterModel]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[RegisterModel]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Apr 01 08:58:48 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/register.scala.html
                  HASH: 11d107ba43d43d29edc34fed2b0266a501a389a7
                  MATRIX: 739->1|858->32|886->35|915->56|953->57|985->63|1112->164|1126->170|1179->202
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4
                  -- GENERATED --
              */
          