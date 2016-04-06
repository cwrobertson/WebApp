// @SOURCE:C:/Users/A587853/Documents/GitHub/WebApp/conf/routes
// @HASH:4e60f105c37cf831bae728fd7fd468f3adfbda40
// @DATE:Wed Apr 06 14:50:09 BST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_LoginController_displayLogin1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_LoginController_displayLogin1_invoker = createInvoker(
controllers.LoginController.displayLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "displayLogin", Nil,"GET", """ Login Page""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_LoginController_postLogin2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("doLogin"))))
private[this] lazy val controllers_LoginController_postLogin2_invoker = createInvoker(
controllers.LoginController.postLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "postLogin", Nil,"POST", """""", Routes.prefix + """doLogin"""))
        

// @LINE:13
private[this] lazy val controllers_LogoutController_logout3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_LogoutController_logout3_invoker = createInvoker(
controllers.LogoutController.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LogoutController", "logout", Nil,"GET", """Logout""", Routes.prefix + """logout"""))
        

// @LINE:16
private[this] lazy val controllers_MyAccountController_displayMyAccount4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("myaccount"))))
private[this] lazy val controllers_MyAccountController_displayMyAccount4_invoker = createInvoker(
controllers.MyAccountController.displayMyAccount(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MyAccountController", "displayMyAccount", Nil,"GET", """ My Account""", Routes.prefix + """myaccount"""))
        

// @LINE:17
private[this] lazy val controllers_UpdateController_updateMyAccount5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("success"))))
private[this] lazy val controllers_UpdateController_updateMyAccount5_invoker = createInvoker(
controllers.UpdateController.updateMyAccount(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "updateMyAccount", Nil,"POST", """""", Routes.prefix + """success"""))
        

// @LINE:18
private[this] lazy val controllers_UpdateController_displayMyUpdate6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update"))))
private[this] lazy val controllers_UpdateController_displayMyUpdate6_invoker = createInvoker(
controllers.UpdateController.displayMyUpdate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "displayMyUpdate", Nil,"GET", """""", Routes.prefix + """update"""))
        

// @LINE:20
private[this] lazy val controllers_Application_java7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("java"))))
private[this] lazy val controllers_Application_java7_invoker = createInvoker(
controllers.Application.java(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "java", Nil,"GET", """Java""", Routes.prefix + """java"""))
        

// @LINE:21
private[this] lazy val controllers_Application_scala8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scala"))))
private[this] lazy val controllers_Application_scala8_invoker = createInvoker(
controllers.Application.scala(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "scala", Nil,"GET", """""", Routes.prefix + """scala"""))
        

// @LINE:22
private[this] lazy val controllers_Application_groovy9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("groovy"))))
private[this] lazy val controllers_Application_groovy9_invoker = createInvoker(
controllers.Application.groovy(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "groovy", Nil,"GET", """""", Routes.prefix + """groovy"""))
        

// @LINE:23
private[this] lazy val controllers_Application_python10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("python"))))
private[this] lazy val controllers_Application_python10_invoker = createInvoker(
controllers.Application.python(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "python", Nil,"GET", """""", Routes.prefix + """python"""))
        

// @LINE:24
private[this] lazy val controllers_Application_ruby11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ruby"))))
private[this] lazy val controllers_Application_ruby11_invoker = createInvoker(
controllers.Application.ruby(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ruby", Nil,"GET", """""", Routes.prefix + """ruby"""))
        

// @LINE:26
private[this] lazy val controllers_RegisterController_displayRegister12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_RegisterController_displayRegister12_invoker = createInvoker(
controllers.RegisterController.displayRegister(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RegisterController", "displayRegister", Nil,"GET", """ Register Page""", Routes.prefix + """register"""))
        

// @LINE:27
private[this] lazy val controllers_RegisterController_doRegister13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("doRegister"))))
private[this] lazy val controllers_RegisterController_doRegister13_invoker = createInvoker(
controllers.RegisterController.doRegister(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RegisterController", "doRegister", Nil,"POST", """""", Routes.prefix + """doRegister"""))
        

// @LINE:29
private[this] lazy val controllers_Assets_versioned14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.LoginController.displayLogin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """doLogin""","""controllers.LoginController.postLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.LogoutController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """myaccount""","""controllers.MyAccountController.displayMyAccount()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """success""","""controllers.UpdateController.updateMyAccount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update""","""controllers.UpdateController.displayMyUpdate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """java""","""controllers.Application.java()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scala""","""controllers.Application.scala()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """groovy""","""controllers.Application.groovy()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """python""","""controllers.Application.python()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ruby""","""controllers.Application.ruby()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.RegisterController.displayRegister()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """doRegister""","""controllers.RegisterController.doRegister()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_LoginController_displayLogin1_route(params) => {
   call { 
        controllers_LoginController_displayLogin1_invoker.call(controllers.LoginController.displayLogin())
   }
}
        

// @LINE:10
case controllers_LoginController_postLogin2_route(params) => {
   call { 
        controllers_LoginController_postLogin2_invoker.call(controllers.LoginController.postLogin())
   }
}
        

// @LINE:13
case controllers_LogoutController_logout3_route(params) => {
   call { 
        controllers_LogoutController_logout3_invoker.call(controllers.LogoutController.logout())
   }
}
        

// @LINE:16
case controllers_MyAccountController_displayMyAccount4_route(params) => {
   call { 
        controllers_MyAccountController_displayMyAccount4_invoker.call(controllers.MyAccountController.displayMyAccount())
   }
}
        

// @LINE:17
case controllers_UpdateController_updateMyAccount5_route(params) => {
   call { 
        controllers_UpdateController_updateMyAccount5_invoker.call(controllers.UpdateController.updateMyAccount())
   }
}
        

// @LINE:18
case controllers_UpdateController_displayMyUpdate6_route(params) => {
   call { 
        controllers_UpdateController_displayMyUpdate6_invoker.call(controllers.UpdateController.displayMyUpdate())
   }
}
        

// @LINE:20
case controllers_Application_java7_route(params) => {
   call { 
        controllers_Application_java7_invoker.call(controllers.Application.java())
   }
}
        

// @LINE:21
case controllers_Application_scala8_route(params) => {
   call { 
        controllers_Application_scala8_invoker.call(controllers.Application.scala())
   }
}
        

// @LINE:22
case controllers_Application_groovy9_route(params) => {
   call { 
        controllers_Application_groovy9_invoker.call(controllers.Application.groovy())
   }
}
        

// @LINE:23
case controllers_Application_python10_route(params) => {
   call { 
        controllers_Application_python10_invoker.call(controllers.Application.python())
   }
}
        

// @LINE:24
case controllers_Application_ruby11_route(params) => {
   call { 
        controllers_Application_ruby11_invoker.call(controllers.Application.ruby())
   }
}
        

// @LINE:26
case controllers_RegisterController_displayRegister12_route(params) => {
   call { 
        controllers_RegisterController_displayRegister12_invoker.call(controllers.RegisterController.displayRegister())
   }
}
        

// @LINE:27
case controllers_RegisterController_doRegister13_route(params) => {
   call { 
        controllers_RegisterController_doRegister13_invoker.call(controllers.RegisterController.doRegister())
   }
}
        

// @LINE:29
case controllers_Assets_versioned14_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        
}

}
     