
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
  def apply/*2.2*/(firstName: String, lastName: String, userName: String, password: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.75*/("""
"""),_display_(/*3.2*/main("My Account")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
"""),format.raw/*4.1*/("""<div class="MyAccountDetails">
    <div class="bttnShow" style="padding-top:2%;">
        <div class="col-sm-6">
            <button type="button" id="displayUserDetails" class="btn btn-primary btn-block">Display User Details</button>
        </div>
        <div class="col-sm-6">
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.UpdateController.displayMyUpdate()),format.raw/*10.64*/("""" id="editUserDetails" class="btn btn-primary btn-block">Go to Google</a>
        </div>
    </div>


    <div id="displayUser">
        <div class="userdetails" style="padding-top: 10%; text-align: center; ">
            <div class="form-inline">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" readonly id="firstName" value="""),_display_(/*19.88*/firstName),format.raw/*19.97*/(""">
            </div>
            <div class="form-inline">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*23.87*/lastName),format.raw/*23.95*/(""">
            </div>
            <div class="form-inline">
                <label for="lastName">User Name:</label>
                <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*27.87*/userName),format.raw/*27.95*/(""">
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
                  DATE: Wed Apr 06 14:51:01 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/MyAccount.scala.html
                  HASH: d976724958bd2b1692c86d9e9251e21616662a67
                  MATRIX: 748->3|909->76|937->79|963->97|1001->98|1029->100|1365->409|1380->415|1436->450|1866->853|1896->862|2129->1068|2158->1076|2391->1282|2420->1290
                  LINES: 26->2|29->2|30->3|30->3|30->3|31->4|37->10|37->10|37->10|46->19|46->19|50->23|50->23|54->27|54->27
                  -- GENERATED --
              */
          