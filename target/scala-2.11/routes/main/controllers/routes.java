
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielgoncalvesti/devel/naturejardim_playframework/conf/routes
// @DATE:Sat Apr 22 15:58:42 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUserCRUD UserCRUD = new controllers.ReverseUserCRUD(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCustomerCRUD CustomerCRUD = new controllers.ReverseCustomerCRUD(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUserCRUD UserCRUD = new controllers.javascript.ReverseUserCRUD(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCustomerCRUD CustomerCRUD = new controllers.javascript.ReverseCustomerCRUD(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
