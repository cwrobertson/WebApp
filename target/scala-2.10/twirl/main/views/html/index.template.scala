
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
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
        </ol>

            <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src=""""),_display_(/*21.28*/routes/*21.34*/.Assets.versioned("img/java.png")),format.raw/*21.67*/("""" class="img-responsive" alt="Chania">
            </div>

            <div class="item">
                <img src=""""),_display_(/*25.28*/routes/*25.34*/.Assets.versioned("img/groovy.png")),format.raw/*25.69*/("""" class="img-responsive" style="height: auto; width: 60%;" alt="Chania">
            </div>

            <div class="item">
                <img src=""""),_display_(/*29.28*/routes/*29.34*/.Assets.versioned("img/Python.png")),format.raw/*29.69*/("""" class="img-responsive" alt="Flower">
            </div>

            <div class="item">
                <img src=""""),_display_(/*33.28*/routes/*33.34*/.Assets.versioned("img/ruby.png")),format.raw/*33.67*/("""" class="img-responsive" alt="Flower">
            </div>
            <div class="item">
                <img src=""""),_display_(/*36.28*/routes/*36.34*/.Assets.versioned("img/scala-logo.png")),format.raw/*36.73*/("""" class="img-responsive" style="height: auto; width: 60%;" alt="Flower">
            </div>
        </div>

            <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Apr 07 11:45:39 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/index.scala.html
                  HASH: f8e56da849cb4c939b3756633d1d1d2c0fe965f1
                  MATRIX: 798->1|821->16|860->18|892->24|954->60|994->92|1032->93|1073->107|1182->190|1195->195|1230->210|1271->224|1318->241|1350->247|1991->861|2006->867|2060->900|2208->1021|2223->1027|2279->1062|2461->1217|2476->1223|2532->1258|2680->1379|2695->1385|2749->1418|2895->1537|2910->1543|2970->1582
                  LINES: 29->1|29->1|29->1|30->2|31->3|31->3|31->3|32->4|33->5|33->5|33->5|34->6|35->7|36->8|49->21|49->21|49->21|53->25|53->25|53->25|57->29|57->29|57->29|61->33|61->33|61->33|64->36|64->36|64->36
                  -- GENERATED --
              */
          