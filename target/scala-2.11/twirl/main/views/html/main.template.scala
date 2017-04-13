
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" media="all" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.versioned("node_modules/angular-material/angular-material.css")),format.raw/*9.128*/("""" type="text/css">
        <link rel="stylesheet" media="all" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.versioned("node_modules/mdi/css/materialdesignicons.min.css")),format.raw/*10.126*/("""" type="text/css">
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
        
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>
    </head>
    <body ng-app="ngNatureJardim" ng-controller="customerCtrl">
	
	<md-toolbar>
	<div class="md-toolbar-tools">
		<p><strong>Nature Jardim</strong></p>
		
		<md-button>
			<md-icon class="mdi mdi-plus-circle"></md-icon>
			Novo Cliente
		</md-button>
	</div>
	</md-toolbar>
	
	
	    
        """),_display_(/*31.10*/content),format.raw/*31.17*/("""
    """),format.raw/*32.5*/("""<script src=""""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("node_modules/angular/angular.js")),format.raw/*32.77*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*33.16*/routes/*33.22*/.Assets.versioned("node_modules/angular-animate/angular-animate.js")),format.raw/*33.90*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*34.16*/routes/*34.22*/.Assets.versioned("node_modules/angular-aria/angular-aria.js")),format.raw/*34.84*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*35.16*/routes/*35.22*/.Assets.versioned("node_modules/angular-material/angular-material.js")),format.raw/*35.92*/("""" type="text/javascript"></script>
	
	<script src=""""),_display_(/*37.16*/routes/*37.22*/.Assets.versioned("scripts/app.js")),format.raw/*37.57*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*38.16*/routes/*38.22*/.Assets.versioned("components/customer.ctr.js")),format.raw/*38.69*/("""" type="text/javascript"></script>
<!-- 	<script src=""""),_display_(/*39.21*/routes/*39.27*/.Assets.versioned("components/customer.fac.js")),format.raw/*39.74*/("""" type="text/javascript"></script> -->
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 02:11:35 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/naturejardim_playframework/app/views/main.scala.html
                  HASH: 91bbd41adac431ca77ce304e76d4387a9354429e
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1101->161|1115->167|1177->208|1256->261|1270->267|1362->338|1458->407|1473->413|1564->482|1677->568|1692->574|1753->613|1814->647|1829->653|1891->694|2258->1034|2286->1041|2318->1046|2359->1060|2374->1066|2447->1118|2524->1168|2539->1174|2628->1242|2705->1292|2720->1298|2803->1360|2880->1410|2895->1416|2986->1486|3065->1538|3080->1544|3136->1579|3213->1629|3228->1635|3296->1682|3378->1737|3393->1743|3461->1790
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|45->14|45->14|45->14|62->31|62->31|63->32|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39
                  -- GENERATED --
              */
          