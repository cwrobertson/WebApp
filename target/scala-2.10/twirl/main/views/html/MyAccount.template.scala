
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
object MyAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstName: String, lastName: String, userName: String, password: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.75*/("""
"""),_display_(/*2.2*/main("My Account")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<div class="MyAccountDetails">
    <div class="bttnShow" style="padding-top:2%;">
        <div class="col-sm-6">
            <a href=""""),_display_(/*6.23*/routes/*6.29*/.MyAccountController.displayMyAccount()),format.raw/*6.68*/("""" id="displayUserDetails" class="btn btn-primary btn-block">Display</a>
        </div>
        <div class="col-sm-6">
            <a href=""""),_display_(/*9.23*/routes/*9.29*/.UpdateController.displayMyUpdate()),format.raw/*9.64*/("""" id="editUserDetails" class="btn btn-primary btn-block">Update</a>
        </div>
    </div>
    <div id="displayUser">
        <div class="userdetails" style="padding-top: 10%; text-align: center; ">
            <div class="form-inline">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" readonly id="firstName" value="""),_display_(/*16.88*/firstName),format.raw/*16.97*/(""">
            </div>
            <div class="form-inline">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*20.87*/lastName),format.raw/*20.95*/(""">
            </div>
            <div class="form-inline">
                <label for="lastName">User Name:</label>
                <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*24.87*/userName),format.raw/*24.95*/(""">
            </div>
        </div>
    </div>
</div>
""")))}))}
  }

  def render(firstName:String,lastName:String,userName:String,password:String): play.twirl.api.HtmlFormat.Appendable = apply(firstName,lastName,userName,password)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (firstName,lastName,userName,password) => apply(firstName,lastName,userName,password)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 06 15:01:43 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/MyAccount.scala.html
                  HASH: 55e777af913c79412ead4363478454a9a70271a4
                  MATRIX: 748->1|909->74|937->77|963->95|1001->96|1029->98|1193->236|1207->242|1266->281|1435->424|1449->430|1504->465|1924->858|1954->867|2187->1073|2216->1081|2449->1287|2478->1295
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|34->6|34->6|34->6|37->9|37->9|37->9|44->16|44->16|48->20|48->20|52->24|52->24
                  -- GENERATED --
              */
          