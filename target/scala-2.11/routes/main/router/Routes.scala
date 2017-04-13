
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Wed Apr 12 20:50:26 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_0: javax.inject.Provider[controllers.Application],
  // @LINE:12
  CustomerCRUD_1: javax.inject.Provider[controllers.CustomerCRUD],
  // @LINE:19
  Assets_2: javax.inject.Provider[controllers.Assets],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_0: javax.inject.Provider[controllers.Application],
    // @LINE:12
    CustomerCRUD_1: javax.inject.Provider[controllers.CustomerCRUD],
    // @LINE:19
    Assets_2: javax.inject.Provider[controllers.Assets]
  ) = this(errorHandler, Application_0, CustomerCRUD_1, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_0, CustomerCRUD_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """@controllers.Application@.customerById(id:Long ?= 1)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/add""", """@controllers.CustomerCRUD@.addJson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/list""", """@controllers.CustomerCRUD@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/list""", """@controllers.Application@.listProducts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries""", """@controllers.Application@.entriesByIdCustomer(customer:Long ?= 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """@controllers.Assets@.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_0.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_customerById1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_Application_customerById1_invoker = createInvoker(
    Application_0.get.customerById(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "customerById",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """customer"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CustomerCRUD_addJson2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/add")))
  )
  private[this] lazy val controllers_CustomerCRUD_addJson2_invoker = createInvoker(
    CustomerCRUD_1.get.addJson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCRUD",
      "addJson",
      Nil,
      "POST",
      """""",
      this.prefix + """customer/add"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CustomerCRUD_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/list")))
  )
  private[this] lazy val controllers_CustomerCRUD_index3_invoker = createInvoker(
    CustomerCRUD_1.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCRUD",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """customer/list"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_listProducts4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/list")))
  )
  private[this] lazy val controllers_Application_listProducts4_invoker = createInvoker(
    Application_0.get.listProducts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "listProducts",
      Nil,
      "GET",
      """""",
      this.prefix + """product/list"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_entriesByIdCustomer5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries")))
  )
  private[this] lazy val controllers_Application_entriesByIdCustomer5_invoker = createInvoker(
    Application_0.get.entriesByIdCustomer(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "entriesByIdCustomer",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """entries"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_2.get.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_0.get.index())
      }
  
    // @LINE:11
    case controllers_Application_customerById1_route(params) =>
      call(params.fromQuery[Long]("id", Some(1))) { (id) =>
        controllers_Application_customerById1_invoker.call(Application_0.get.customerById(id))
      }
  
    // @LINE:12
    case controllers_CustomerCRUD_addJson2_route(params) =>
      call { 
        controllers_CustomerCRUD_addJson2_invoker.call(CustomerCRUD_1.get.addJson())
      }
  
    // @LINE:13
    case controllers_CustomerCRUD_index3_route(params) =>
      call { 
        controllers_CustomerCRUD_index3_invoker.call(CustomerCRUD_1.get.index())
      }
  
    // @LINE:14
    case controllers_Application_listProducts4_route(params) =>
      call { 
        controllers_Application_listProducts4_invoker.call(Application_0.get.listProducts())
      }
  
    // @LINE:16
    case controllers_Application_entriesByIdCustomer5_route(params) =>
      call(params.fromQuery[Long]("customer", Some(1))) { (customer) =>
        controllers_Application_entriesByIdCustomer5_invoker.call(Application_0.get.entriesByIdCustomer(customer))
      }
  
    // @LINE:19
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_2.get.versioned(path, file))
      }
  }
}