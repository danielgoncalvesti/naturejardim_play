
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Sat Apr 15 23:52:48 BRT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseCustomerCRUD(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def updateJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCRUD.updateJson",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/update"})
        }
      """
    )
  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCRUD.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/list"})
        }
      """
    )
  
    // @LINE:9
    def addJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCRUD.addJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/add"})
        }
      """
    )
  
    // @LINE:11
    def deleteJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCRUD.deleteJson",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
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

  
    // @LINE:14
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.listProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/list"})
        }
      """
    )
  
    // @LINE:18
    def popular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.popular",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "popular"})
        }
      """
    )
  
    // @LINE:16
    def entriesByIdCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.entriesByIdCustomer",
      """
        function(customer) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "entries" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("customer", customer)])})
        }
      """
    )
  
    // @LINE:8
    def customerById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.customerById",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
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
  
  }


}