
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Web App")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*2.5*/("""<div class="flash-index">
        """),_display_(/*3.10*/if(flash.get("success") != null)/*3.42*/{_display_(Seq[Any](format.raw/*3.43*/("""
            """),format.raw/*4.13*/("""<div class="alert alert-success fade in" style="text-align: center">
            """),_display_(/*5.14*/flash/*5.19*/.get("success")),format.raw/*5.34*/("""
            """),format.raw/*6.13*/("""</div>
        """)))}),format.raw/*7.10*/("""
    """),format.raw/*8.5*/("""</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 06 14:20:47 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/index.scala.html
                  HASH: 79fc5d5d78bc2df8c5c9ee149a1e6f2e7e7a52e2
                  MATRIX: 798->1|821->16|860->18|892->24|954->60|994->92|1032->93|1073->107|1182->190|1195->195|1230->210|1271->224|1318->241|1350->247
                  LINES: 29->1|29->1|29->1|30->2|31->3|31->3|31->3|32->4|33->5|33->5|33->5|34->6|35->7|36->8
                  -- GENERATED --
              */
          