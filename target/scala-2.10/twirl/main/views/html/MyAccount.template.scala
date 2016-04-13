
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

"""),format.raw/*4.1*/("""<div class="MyAccountDetails">
    <div style="padding-bottom: 1%;">
    """),_display_(/*6.6*/if(flash.get("success") != null)/*6.38*/{_display_(Seq[Any](format.raw/*6.39*/("""
        """),format.raw/*7.9*/("""<div class="alert alert-success fade in" style="text-align: center">
        """),_display_(/*8.10*/flash/*8.15*/.get("success")),format.raw/*8.30*/("""
        """),format.raw/*9.9*/("""</div>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""</div>

    <div class="bttnShow" style="padding-top:2%;">
        <div class="col-sm-12">
            <a href=""""),_display_(/*15.23*/routes/*15.29*/.UpdateController.displayMyUpdate()),format.raw/*15.64*/("""" id="editUserDetails" class="btn btn-primary btn-block">Update</a>
        </div>
    </div>
    <div id="displayUser">
        <div class="userdetails" style="padding-top: 10%; text-align: center; ">
            <div class="form-inline">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" readonly id="firstName" value="""),_display_(/*22.88*/firstName),format.raw/*22.97*/(""">
            </div>
            <div class="form-inline">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*26.87*/lastName),format.raw/*26.95*/(""">
            </div>
            <div class="form-inline">
                <label for="lastName">User Name:</label>
                <input type="text" class="form-control" readonly id="lastName" value="""),_display_(/*30.87*/userName),format.raw/*30.95*/(""">
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
                  DATE: Thu Apr 07 13:23:12 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/MyAccount.scala.html
                  HASH: 28f7077f1ed4123dc6a377b862088bdca118cd14
                  MATRIX: 748->1|909->74|937->77|963->95|1001->96|1031->100|1132->176|1172->208|1210->209|1246->219|1351->298|1364->303|1399->318|1435->328|1478->341|1511->347|1655->464|1670->470|1726->505|2146->898|2176->907|2409->1113|2438->1121|2671->1327|2700->1335
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|34->6|34->6|34->6|35->7|36->8|36->8|36->8|37->9|38->10|39->11|43->15|43->15|43->15|50->22|50->22|54->26|54->26|58->30|58->30
                  -- GENERATED --
              */
          