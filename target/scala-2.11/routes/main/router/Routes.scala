
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Sat Apr 22 15:58:42 BRT 2017

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
  Application_1: javax.inject.Provider[controllers.Application],
  // @LINE:8
  CustomerCRUD_2: javax.inject.Provider[controllers.CustomerCRUD],
  // @LINE:13
  UserCRUD_0: javax.inject.Provider[controllers.UserCRUD],
  // @LINE:23
  Assets_3: javax.inject.Provider[controllers.Assets],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: javax.inject.Provider[controllers.Application],
    // @LINE:8
    CustomerCRUD_2: javax.inject.Provider[controllers.CustomerCRUD],
    // @LINE:13
    UserCRUD_0: javax.inject.Provider[controllers.UserCRUD],
    // @LINE:23
    Assets_3: javax.inject.Provider[controllers.Assets]
  ) = this(errorHandler, Application_1, CustomerCRUD_2, UserCRUD_0, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, CustomerCRUD_2, UserCRUD_0, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """@controllers.CustomerCRUD@.customerById(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/add""", """@controllers.CustomerCRUD@.addJson()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/update""", """@controllers.CustomerCRUD@.updateJson()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/$id<[^/]+>""", """@controllers.CustomerCRUD@.deleteJson(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """@controllers.UserCRUD@.doLogin(login:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/list""", """@controllers.CustomerCRUD@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/list""", """@controllers.Application@.listProducts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """entries""", """@controllers.Application@.entriesByIdCustomer(customer:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """popular""", """@controllers.Application@.popular()"""),
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
    Application_1.get.index(),
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

  // @LINE:8
  private[this] lazy val controllers_CustomerCRUD_customerById1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_CustomerCRUD_customerById1_invoker = createInvoker(
    CustomerCRUD_2.get.customerById(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCRUD",
      "customerById",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """customer"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CustomerCRUD_addJson2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/add")))
  )
  private[this] lazy val controllers_CustomerCRUD_addJson2_invoker = createInvoker(
    CustomerCRUD_2.get.addJson(),
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

  // @LINE:10
  private[this] lazy val controllers_CustomerCRUD_updateJson3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/update")))
  )
  private[this] lazy val controllers_CustomerCRUD_updateJson3_invoker = createInvoker(
    CustomerCRUD_2.get.updateJson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCRUD",
      "updateJson",
      Nil,
      "PUT",
      """""",
      this.prefix + """customer/update"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CustomerCRUD_deleteJson4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerCRUD_deleteJson4_invoker = createInvoker(
    CustomerCRUD_2.get.deleteJson(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCRUD",
      "deleteJson",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """customer/$id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserCRUD_doLogin5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserCRUD_doLogin5_invoker = createInvoker(
    UserCRUD_0.get.doLogin(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserCRUD",
      "doLogin",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CustomerCRUD_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/list")))
  )
  private[this] lazy val controllers_CustomerCRUD_index6_invoker = createInvoker(
    CustomerCRUD_2.get.index(),
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

  // @LINE:16
  private[this] lazy val controllers_Application_listProducts7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/list")))
  )
  private[this] lazy val controllers_Application_listProducts7_invoker = createInvoker(
    Application_1.get.listProducts(),
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

  // @LINE:18
  private[this] lazy val controllers_Application_entriesByIdCustomer8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("entries")))
  )
  private[this] lazy val controllers_Application_entriesByIdCustomer8_invoker = createInvoker(
    Application_1.get.entriesByIdCustomer(fakeValue[Long]),
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

  // @LINE:20
  private[this] lazy val controllers_Application_popular9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("popular")))
  )
  private[this] lazy val controllers_Application_popular9_invoker = createInvoker(
    Application_1.get.popular(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "popular",
      Nil,
      "GET",
      """""",
      this.prefix + """popular"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_3.get.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_1.get.index())
      }
  
    // @LINE:8
    case controllers_CustomerCRUD_customerById1_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CustomerCRUD_customerById1_invoker.call(CustomerCRUD_2.get.customerById(id))
      }
  
    // @LINE:9
    case controllers_CustomerCRUD_addJson2_route(params) =>
      call { 
        controllers_CustomerCRUD_addJson2_invoker.call(CustomerCRUD_2.get.addJson())
      }
  
    // @LINE:10
    case controllers_CustomerCRUD_updateJson3_route(params) =>
      call { 
        controllers_CustomerCRUD_updateJson3_invoker.call(CustomerCRUD_2.get.updateJson())
      }
  
    // @LINE:11
    case controllers_CustomerCRUD_deleteJson4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerCRUD_deleteJson4_invoker.call(CustomerCRUD_2.get.deleteJson(id))
      }
  
    // @LINE:13
    case controllers_UserCRUD_doLogin5_route(params) =>
      call(params.fromQuery[String]("login", None), params.fromQuery[String]("password", None)) { (login, password) =>
        controllers_UserCRUD_doLogin5_invoker.call(UserCRUD_0.get.doLogin(login, password))
      }
  
    // @LINE:15
    case controllers_CustomerCRUD_index6_route(params) =>
      call { 
        controllers_CustomerCRUD_index6_invoker.call(CustomerCRUD_2.get.index())
      }
  
    // @LINE:16
    case controllers_Application_listProducts7_route(params) =>
      call { 
        controllers_Application_listProducts7_invoker.call(Application_1.get.listProducts())
      }
  
    // @LINE:18
    case controllers_Application_entriesByIdCustomer8_route(params) =>
      call(params.fromQuery[Long]("customer", None)) { (customer) =>
        controllers_Application_entriesByIdCustomer8_invoker.call(Application_1.get.entriesByIdCustomer(customer))
      }
  
    // @LINE:20
    case controllers_Application_popular9_route(params) =>
      call { 
        controllers_Application_popular9_invoker.call(Application_1.get.popular())
      }
  
    // @LINE:23
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_3.get.versioned(path, file))
      }
  }
}