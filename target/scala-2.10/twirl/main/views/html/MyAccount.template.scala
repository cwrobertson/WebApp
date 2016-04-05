
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
object MyAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstName: String, lastName: String, userName: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.57*/("""
"""),_display_(/*2.2*/main("My Account")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<div class="MyAccountDetails">
    <div class="userdetails" style="padding-top: 17%; text-align: center; ">
        <div class="form-inline">
            <label for="firstName">First Name:</label>
            <input type="text" class="form-control" readonly id="firstName" value="""),_display_(/*7.84*/firstName),format.raw/*7.93*/(""">
        </div>
        <div class="form-inline">
            <label for="lastName">Last Name:</label>
            <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*11.83*/lastName),format.raw/*11.91*/(""">
        </div>
        <div class="form-inline">
            <label for="lastName">User Name:</label>
            <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*15.83*/userName),format.raw/*15.91*/(""">
        </div>
    </div>
</div>
""")))}))}
  }

  def render(firstName:String,lastName:String,userName:String): play.twirl.api.HtmlFormat.Appendable = apply(firstName,lastName,userName)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (firstName,lastName,userName) => apply(firstName,lastName,userName)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 04 15:33:12 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/MyAccount.scala.html
                  HASH: 1f50e2d3fe1e926cd17aeda103787fc2ef521dee
                  MATRIX: 741->1|884->56|912->59|938->77|976->78|1004->80|1314->364|1343->373|1560->563|1589->571|1806->761|1835->769
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|35->7|35->7|39->11|39->11|43->15|43->15
                  -- GENERATED --
              */
          