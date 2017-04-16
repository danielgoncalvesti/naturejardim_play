
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Sat Apr 15 23:52:48 BRT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
