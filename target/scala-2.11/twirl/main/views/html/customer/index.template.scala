
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

   """),format.raw/*5.4*/("""<body ng-app="ngNatureJardim" ng-controller="customerCtrl">

	
	
	<md-toolbar>
		<div class="md-toolbar-tools">
			<p><strong>Nature Jardim</strong></p>
			
			<md-button ng-click="toggleLeft()">
				<md-icon class="mdi mdi-plus-circle"></md-icon>
				Novo Cliente
			</md-button>
		</div>
	</md-toolbar>
		<div  layout="column" ng-cloak>

    <md-sidenav class="md-sidenav-left" md-component-id="left"
                md-disable-backdrop md-whiteframe="4">
     <md-toolbar class="md-theme-indigo">
        <h1 class="md-toolbar-tools">Menu</h1>
      </md-toolbar>
	
		<md-content layout-padding>
			<form>
				<md-input-container>
					<label for="name">Nome</label>
					<input type="text" name="name" id="name"
						   ng-model="customer.name"
						   md-autofocus>
										   
				</md-input-container>
				<md-input-container>
						<label for="address">Endereço</label>	
					<input type="text" name="address" id="address"
						   ng-model="customer.address">					
				</md-input-container>
				<p>
				<md-button ng-click="saveCustomer(customer)" class="md-primary">
					Save
				</md-button>
				<md-button class="md-primary">
					Save Edit
				</md-button>		
				<md-button class="md-warn" ng-click="toggleLeft()">
					Cancel
				</md-button>
				</p>
				<pre>"""),format.raw/*52.10*/("""{"""),format.raw/*52.11*/("""{"""),format.raw/*52.12*/(""" """),format.raw/*52.13*/("""customer | json """),format.raw/*52.29*/("""}"""),format.raw/*52.30*/("""}"""),format.raw/*52.31*/("""</pre>					
			</form>
		</md-content>	
	</md-sidenav>
	</div>
	<md-content>
		<md-list flex>	
			<md-subheader class="md-no-sticky">Clientes:</md-subheader>
	        <md-list-item class="md-3-line"  ng-repeat="customer in customers" ng-click="null">
	          <div class="md-list-item-text" layout="column">
	            <p>"""),format.raw/*62.17*/("""{"""),format.raw/*62.18*/("""{"""),format.raw/*62.19*/(""" """),format.raw/*62.20*/("""customer.name """),format.raw/*62.34*/("""}"""),format.raw/*62.35*/("""}"""),format.raw/*62.36*/("""</p>
	            <p>"""),format.raw/*63.17*/("""{"""),format.raw/*63.18*/("""{"""),format.raw/*63.19*/(""" """),format.raw/*63.20*/("""customer.address """),format.raw/*63.37*/("""}"""),format.raw/*63.38*/("""}"""),format.raw/*63.39*/("""</p>
	          </div>
	        </md-list-item>
		</md-list>
	</md-content>


    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("node_modules/angular/angular.js")),format.raw/*70.77*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*71.16*/routes/*71.22*/.Assets.versioned("node_modules/angular-animate/angular-animate.js")),format.raw/*71.90*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*72.16*/routes/*72.22*/.Assets.versioned("node_modules/angular-aria/angular-aria.js")),format.raw/*72.84*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*73.16*/routes/*73.22*/.Assets.versioned("node_modules/angular-material/angular-material.js")),format.raw/*73.92*/("""" type="text/javascript"></script>
	
	
	<script src=""""),_display_(/*76.16*/routes/*76.22*/.Assets.versioned("scripts/app.js")),format.raw/*76.57*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*77.16*/routes/*77.22*/.Assets.versioned("components/customer.ctr.js")),format.raw/*77.69*/("""" type="text/javascript"></script>
<!-- 	<script src=""""),_display_(/*78.21*/routes/*78.27*/.Assets.versioned("components/customer.fac.js")),format.raw/*78.74*/("""" type="text/javascript"></script> -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/3.10.1/lodash.min.js"></script>
	
""")))}),format.raw/*81.2*/("""
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
                  DATE: Sat Apr 15 23:52:48 BRT 2017
                  SOURCE: /Users/danielgoncalvesti/devel/naturejardim_playframework/app/views/customer/index.scala.html
                  HASH: 8fb8dc792175a8369636a2c98db5d41718885d22
                  MATRIX: 754->1|866->18|894->21|918->37|957->39|988->44|2296->1324|2325->1325|2354->1326|2383->1327|2427->1343|2456->1344|2485->1345|2839->1671|2868->1672|2897->1673|2926->1674|2968->1688|2997->1689|3026->1690|3075->1711|3104->1712|3133->1713|3162->1714|3207->1731|3236->1732|3265->1733|3388->1829|3403->1835|3476->1887|3553->1937|3568->1943|3657->2011|3734->2061|3749->2067|3832->2129|3909->2179|3924->2185|4015->2255|4096->2309|4111->2315|4167->2350|4244->2400|4259->2406|4327->2453|4409->2508|4424->2514|4492->2561|4659->2698
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|83->52|83->52|83->52|83->52|83->52|83->52|83->52|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|112->81
                  -- GENERATED --
              */
          