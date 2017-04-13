
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Wed Apr 12 20:50:26 BRT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:12
  class ReverseCustomerCRUD(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCRUD.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/list"})
        }
      """
    )
  
    // @LINE:12
    def addJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCRUD.addJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/add"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def entriesByIdCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.entriesByIdCustomer",
      """
        function(customer) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entries" + _qS([(customer == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("customer", customer))])})
        }
      """
    )
  
    // @LINE:11
    def customerById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.customerById",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.listProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/list"})
        }
      """
    )
  
  }


}