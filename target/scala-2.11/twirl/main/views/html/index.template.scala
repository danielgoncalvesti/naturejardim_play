
package views.html

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

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<body ng-app="ngNatureJardim" ng-controller="customerCtrl">
	
		

	<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("node_modules/angular/angular.js")),format.raw/*9.74*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("scripts/app.js")),format.raw/*10.57*/("""" type="text/javascript"></script>

""")))}),format.raw/*12.2*/("""
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
                  DATE: Sat Apr 22 13:46:32 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/naturejardim_playframework/app/views/index.scala.html
                  HASH: c782990f93e20b8e1b37e1b48f0c4a30e33f1caa
                  MATRIX: 745->1|857->18|885->21|916->44|955->46|987->52|1094->133|1108->139|1180->191|1257->241|1272->247|1328->282|1395->319
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9|41->10|41->10|41->10|43->12
                  -- GENERATED --
              */
          