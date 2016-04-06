
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
object navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=""""),_display_(/*9.38*/routes/*9.44*/.Application.index()),format.raw/*9.64*/("""">WebSiteName</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      """),_display_(/*13.8*/if(session().get("user") != null)/*13.41*/ {_display_(Seq[Any](format.raw/*13.43*/("""
        """),format.raw/*14.9*/("""<li><a href=""""),_display_(/*14.23*/routes/*14.29*/.Application.java()),format.raw/*14.48*/("""">Java</a></li>
        <li><a href=""""),_display_(/*15.23*/routes/*15.29*/.Application.scala()),format.raw/*15.49*/("""">Scala</a></li>
        <li><a href=""""),_display_(/*16.23*/routes/*16.29*/.Application.groovy()),format.raw/*16.50*/("""">Groovy</a></li>
        <li><a href=""""),_display_(/*17.23*/routes/*17.29*/.Application.python()),format.raw/*17.50*/("""">Python</a></li>
        <li><a href=""""),_display_(/*18.23*/routes/*18.29*/.Application.ruby()),format.raw/*18.48*/("""">Ruby</a></li>
      """)))}),format.raw/*19.8*/("""
      """),format.raw/*20.7*/("""</ul>
      <ul class="nav navbar-nav navbar-right">
        """),_display_(/*22.10*/if(session().get("user") == null)/*22.43*/ {_display_(Seq[Any](format.raw/*22.45*/("""
          """),format.raw/*23.11*/("""<li><a href=""""),_display_(/*23.25*/routes/*23.31*/.RegisterController.displayRegister()),format.raw/*23.68*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
          <li><a href=""""),_display_(/*24.25*/routes/*24.31*/.LoginController.displayLogin()),format.raw/*24.62*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        """)))}/*25.11*/else/*25.16*/{_display_(Seq[Any](format.raw/*25.17*/("""
          """),format.raw/*26.11*/("""<li><a href=""""),_display_(/*26.25*/routes/*26.31*/.MyAccountController.displayMyAccount()),format.raw/*26.70*/(""""><span class="glyphicon glyphicon-user"></span> My Account</a></li>
          <li><a href=""""),_display_(/*27.25*/routes/*27.31*/.LogoutController.logout()),format.raw/*27.57*/(""""><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
         """)))}),format.raw/*28.11*/("""
      """),format.raw/*29.7*/("""</ul>
    </div>
  </div>
</nav>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 06 14:20:47 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/navbar.scala.html
                  HASH: 7966582fa039c889188c2ed87e8ab111b81ae598
                  MATRIX: 799->0|1218->393|1232->399|1272->419|1429->550|1471->583|1511->585|1548->595|1589->609|1604->615|1644->634|1710->673|1725->679|1766->699|1833->739|1848->745|1890->766|1958->807|1973->813|2015->834|2083->875|2098->881|2138->900|2192->924|2227->932|2318->996|2360->1029|2400->1031|2440->1043|2481->1057|2496->1063|2554->1100|2672->1191|2687->1197|2739->1228|2834->1305|2847->1310|2886->1311|2926->1323|2967->1337|2982->1343|3042->1382|3163->1476|3178->1482|3225->1508|3335->1587|3370->1595
                  LINES: 29->1|37->9|37->9|37->9|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|48->20|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|56->28|57->29
                  -- GENERATED --
              */
          