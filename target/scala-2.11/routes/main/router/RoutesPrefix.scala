
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Wed Apr 12 20:50:26 BRT 2017


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
