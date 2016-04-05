
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
                  DATE: Mon Apr 04 09:38:55 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/main.scala.html
                  HASH: d08b886d153a5d80a08da03292573f04a524284c
                  MATRIX: 727->1|845->31|873->33|959->93|984->98|1496->583|1511->589|1570->627|1664->694|1679->700|1733->733|1798->771|1827->779|1864->789|1927->825|1955->832|1992->842
                  LINES: 26->1|29->1|30->2|33->5|33->5|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|47->19|48->20|48->20|49->21
                  -- GENERATED --
              */
          