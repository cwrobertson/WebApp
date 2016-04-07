
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html ng-app>
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

            <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

            <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("js/angular.min.js")),format.raw/*14.67*/(""""></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("css/main.css")),format.raw/*15.94*/("""">
    </head>
    <body>
        """),_display_(/*18.10*/navbar()),format.raw/*18.18*/("""
        """),format.raw/*19.9*/("""<div class="wrapper">
            """),_display_(/*20.14*/content),format.raw/*20.21*/("""
        """),format.raw/*21.9*/("""</div>
    </body>
    <script>
            $(document).ready(function()"""),format.raw/*24.41*/("""{"""),format.raw/*24.42*/("""
                """),format.raw/*25.17*/("""$("#showPassword").click(function()"""),format.raw/*25.52*/("""{"""),format.raw/*25.53*/("""
                    """),format.raw/*26.21*/("""if ($("#password").attr("type")=="password") """),format.raw/*26.66*/("""{"""),format.raw/*26.67*/("""
                        """),format.raw/*27.25*/("""$("#password").attr("type", "text");
                    """),format.raw/*28.21*/("""}"""),format.raw/*28.22*/("""
                    """),format.raw/*29.21*/("""else """),format.raw/*29.26*/("""{"""),format.raw/*29.27*/("""
                        """),format.raw/*30.25*/("""$("#password").attr("type", "password");
                    """),format.raw/*31.21*/("""}"""),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/(""");
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""");

    </script>
    <footer>
        <p>Posted by: Callum Robertson</p>
    </footer>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 07 10:24:20 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/main.scala.html
                  HASH: 96a466b85acfd946fe15e7a480615d689b61a76c
                  MATRIX: 727->1|845->31|873->33|959->93|984->98|1496->583|1511->589|1570->627|1664->694|1679->700|1733->733|1798->771|1827->779|1864->789|1927->825|1955->832|1992->842|2095->917|2124->918|2170->936|2233->971|2262->972|2312->994|2385->1039|2414->1040|2468->1066|2554->1124|2583->1125|2633->1147|2666->1152|2695->1153|2749->1179|2839->1241|2868->1242|2914->1260|2943->1261|2987->1277|3016->1278
                  LINES: 26->1|29->1|30->2|33->5|33->5|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|47->19|48->20|48->20|49->21|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|56->28|57->29|57->29|57->29|58->30|59->31|59->31|60->32|60->32|61->33|61->33
                  -- GENERATED --
              */
          