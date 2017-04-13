
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Customer")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""


  """),format.raw/*6.3*/("""<md-content>
      <md-list flex>	
		<md-subheader class="md-no-sticky">Clientes:</md-subheader>
        <md-list-item class="md-3-line"  ng-repeat="customer in customers" ng-click="null">
          <div class="md-list-item-text" layout="column">
            <h4>"""),format.raw/*11.17*/("""{"""),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""customer.id """),format.raw/*11.32*/("""}"""),format.raw/*11.33*/("""}"""),format.raw/*11.34*/("""</h4>
            <h3>"""),format.raw/*12.17*/("""{"""),format.raw/*12.18*/("""{"""),format.raw/*12.19*/(""" """),format.raw/*12.20*/("""customer.name """),format.raw/*12.34*/("""}"""),format.raw/*12.35*/("""}"""),format.raw/*12.36*/("""</h3>
          </div>
        </md-list-item>
</md-list>
</md-content>

""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 01:35:12 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/naturejardim_playframework/app/views/customer/index.scala.html
                  HASH: 8180a62a7a9696eeafa15b0f36d37350719b3e3f
                  MATRIX: 754->1|866->18|894->21|918->37|957->39|988->44|1279->307|1308->308|1337->309|1366->310|1406->322|1435->323|1464->324|1514->346|1543->347|1572->348|1601->349|1643->363|1672->364|1701->365|1805->439
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|42->11|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|49->18
                  -- GENERATED --
              */
          