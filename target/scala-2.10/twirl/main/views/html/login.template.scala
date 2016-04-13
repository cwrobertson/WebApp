
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[UserModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[UserModel]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main("Login Page")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<div class="loginForm">
            """),_display_(/*4.14*/if(flash.get("error") != null)/*4.44*/{_display_(Seq[Any](format.raw/*4.45*/("""
                """),format.raw/*5.17*/("""<div class="alert alert-danger fade in" style="text-align: center">
                    """),_display_(/*6.22*/flash/*6.27*/.get("error")),format.raw/*6.40*/("""
                """),format.raw/*7.17*/("""</div>
            """)))}),format.raw/*8.14*/("""
        """),format.raw/*9.9*/("""<form class="form-horizontal" role="form" method="post" action=""""),_display_(/*9.74*/routes/*9.80*/.LoginController.postLogin()),format.raw/*9.108*/("""">
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

  def render(userForm:Form[UserModel]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[UserModel]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 07 13:17:45 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/login.scala.html
                  HASH: 1482c3f7fcb3c138f9a3293c0de1bd26c3c8d7eb
                  MATRIX: 732->1|847->28|875->31|901->49|939->50|971->56|1035->94|1073->124|1111->125|1156->143|1272->233|1285->238|1318->251|1363->269|1414->290|1450->300|1541->365|1555->371|1604->399
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|34->6|34->6|34->6|35->7|36->8|37->9|37->9|37->9|37->9
                  -- GENERATED --
              */
          