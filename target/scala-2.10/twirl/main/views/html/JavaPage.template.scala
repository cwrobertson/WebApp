
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
object JavaPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Java Programming Language")/*1.35*/{_display_(Seq[Any](format.raw/*1.36*/("""
    """),format.raw/*2.5*/("""<div class="row">
        <div class="col-sm-8" style="padding-top: 7%;">
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi varius, libero molestie accumsan tempor, tellus ipsum pretium nulla, sit amet faucibus dolor nunc at velit.
                Maecenas ornare ut magna id pretium. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a nisi ante. Proin aliquet erat nisi. Aenean mauris arcu, commodo eget erat sed, lobortis rhoncus tortor.
                Nulla dictum arcu sit amet facilisis varius. Donec venenatis maximus velit rhoncus euismod. Maecenas blandit facilisis sem, nec lobortis nunc dignissim nec.
            </p>
            <br>
            <p>
                Sed elementum varius nibh fermentum iaculis. Ut sit amet quam a tortor tempor ullamcorper et in nisl. Aenean sodales est eros, id dictum mi bibendum ac. Integer non ex a elit tempus interdum a eget massa. Etiam sagittis diam aliquet facilisis aliquam. Nunc a malesuada leo.
                Maecenas eu est iaculis, luctus mi in, fringilla nunc. Sed tincidunt vitae lacus quis ornare. Sed convallis tortor vel tellus tincidunt, vel pulvinar tellus elementum. Nunc sit amet libero at nibh sollicitudin vehicula. Nam accumsan volutpat magna non ornare. Maecenas mattis, leo id pretium posuere, orci lacus tristique diam, id fringilla mauris urna non turpis. Morbi tincidunt augue id scelerisque sagittis.
                Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
            </p>
            <br>
            <p>
                Aliquam ante ipsum, malesuada et risus quis, ultrices euismod tellus. Nam vel aliquet mauris, aliquet aliquet mauris. Ut eget diam eget justo lacinia rhoncus id eget ex.
                Sed dapibus eros sed tempor convallis. Praesent in turpis sed felis luctus eleifend eget egestas purus. Aenean nec libero et sapien rutrum ultrices eu vel mauris. Suspendisse a bibendum eros.
                Vivamus sed purus enim. Morbi varius porta sem in pretium. Quisque non porta nibh. Cras ac nisi eros. Fusce nibh dolor, mollis in sollicitudin finibus, ultricies quis tortor.
                Vivamus sollicitudin, leo id consectetur scelerisque, justo magna sollicitudin turpis, vel tristique justo lectus sed risus. Integer scelerisque orci nec ex euismod, a cursus elit consequat.
            </p>
        </div>
        <div class="col-sm-4"><img class="img-responsive" src=""""),_display_(/*23.65*/routes/*23.71*/.Assets.versioned("img/java.png")),format.raw/*23.104*/("""" style="padding-top: 30%;" class="img-rounded" alt="Cinque Terre" width="304" height="236"></div>
    </div>


""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Apr 04 11:06:12 BST 2016
                  SOURCE: C:/Users/A587853/Documents/GitHub/WebApp/app/views/JavaPage.scala.html
                  HASH: 6c250cb5fa142da2270e978860bd073c9c218974
                  MATRIX: 801->1|842->34|880->35|912->41|3506->2608|3521->2614|3576->2647
                  LINES: 29->1|29->1|29->1|30->2|51->23|51->23|51->23
                  -- GENERATED --
              */
          