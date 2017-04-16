
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

	
	
	    
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""

    """),format.raw/*22.5*/("""</body>
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
                  DATE: Sat Apr 15 23:52:48 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/naturejardim_playframework/app/views/main.scala.html
                  HASH: 20481d073281060bc8fc2b64a0e2d01ce7fcb879
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1101->161|1115->167|1177->208|1256->261|1270->267|1362->338|1458->407|1473->413|1564->482|1677->568|1692->574|1753->613|1814->647|1829->653|1891->694|1985->761|2013->768|2046->774
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|45->14|45->14|45->14|51->20|51->20|53->22
                  -- GENERATED --
              */
          