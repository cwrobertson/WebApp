
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
        function tick(el) """),format.raw/*24.27*/("""{"""),format.raw/*24.28*/("""
        """),format.raw/*25.9*/("""$('#input').attr('type',el.checked ? 'text' : 'password');
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""

        """),format.raw/*28.9*/("""function togglePasswordVisibility() """),format.raw/*28.45*/("""{"""),format.raw/*28.46*/("""
            """),format.raw/*29.13*/("""$('#password').attr('type',  $('#showPassword').prop('checked') ? 'text' : 'password');
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
"""),format.raw/*31.1*/("""</script>

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
                  DATE: Wed Apr 06 14:37:56 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/main.scala.html
                  HASH: 0578df06a1eee31b28f6aeb6d9bd19cf271fd7b9
                  MATRIX: 727->1|845->31|873->33|959->93|984->98|1496->583|1511->589|1570->627|1664->694|1679->700|1733->733|1798->771|1827->779|1864->789|1927->825|1955->832|1992->842|2081->903|2110->904|2147->914|2242->982|2271->983|2310->995|2374->1031|2403->1032|2445->1046|2569->1143|2598->1144|2627->1146
                  LINES: 26->1|29->1|30->2|33->5|33->5|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|47->19|48->20|48->20|49->21|52->24|52->24|53->25|54->26|54->26|56->28|56->28|56->28|57->29|58->30|58->30|59->31
                  -- GENERATED --
              */
          