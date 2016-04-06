
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
        """),_display_(/*4.10*/if(flash.get("error") != null)/*4.40*/{_display_(Seq[Any](format.raw/*4.41*/("""
            """),format.raw/*5.13*/("""<div class="alert alert-danger fade in" style="text-align: center">
            """),_display_(/*6.14*/flash/*6.19*/.get("error")),format.raw/*6.32*/("""
            """),format.raw/*7.13*/("""</div>
        """)))}),format.raw/*8.10*/("""
        """),format.raw/*9.9*/("""<form class="form-horizontal" role="form" method="post" action=""""),_display_(/*9.74*/routes/*9.80*/.RegisterController.doRegister()),format.raw/*9.112*/("""">
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
                  DATE: Wed Apr 06 14:20:47 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/register.scala.html
                  HASH: 9bb930e5c2d9399e9d8bea06aa536ba6041c2c76
                  MATRIX: 739->1|858->32|886->35|915->56|953->57|985->63|1048->100|1086->130|1124->131|1165->145|1273->227|1286->232|1319->245|1360->259|1407->276|1443->286|1534->351|1548->357|1601->389
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|34->6|34->6|34->6|35->7|36->8|37->9|37->9|37->9|37->9
                  -- GENERATED --
              */
          