// @SOURCE:C:/Users/A587853/Documents/GitHub/WebApp/conf/routes
// @HASH:505c6da89598fa2be852fb3e77a8c732e7463c63
// @DATE:Mon Apr 04 11:23:00 BST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:28
class ReverseAssets {


// @LINE:28
def versioned(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:26
// @LINE:25
class ReverseRegisterController {


// @LINE:26
def doRegister(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "doRegister")
}
                        

// @LINE:25
def displayRegister(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                        

}
                          

// @LINE:10
// @LINE:9
class ReverseLoginController {


// @LINE:10
def postLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "doLogin")
}
                        

// @LINE:9
def displayLogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:13
class ReverseLogoutController {


// @LINE:13
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:21
def groovy(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "groovy")
}
                        

// @LINE:19
def java(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "java")
}
                        

// @LINE:20
def scala(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scala")
}
                        

// @LINE:23
def ruby(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ruby")
}
                        

// @LINE:22
def python(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "python")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:16
class ReverseMyAccountController {


// @LINE:16
def displayMyAccount(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "myaccount")
}
                        

}
                          
}
                  


// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:28
class ReverseAssets {


// @LINE:28
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:26
// @LINE:25
class ReverseRegisterController {


// @LINE:26
def doRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RegisterController.doRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doRegister"})
      }
   """
)
                        

// @LINE:25
def displayRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RegisterController.displayRegister",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

}
              

// @LINE:10
// @LINE:9
class ReverseLoginController {


// @LINE:10
def postLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.postLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doLogin"})
      }
   """
)
                        

// @LINE:9
def displayLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LoginController.displayLogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:13
class ReverseLogoutController {


// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LogoutController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:21
def groovy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.groovy",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "groovy"})
      }
   """
)
                        

// @LINE:19
def java : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.java",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "java"})
      }
   """
)
                        

// @LINE:20
def scala : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.scala",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala"})
      }
   """
)
                        

// @LINE:23
def ruby : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ruby",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ruby"})
      }
   """
)
                        

// @LINE:22
def python : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.python",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "python"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:16
class ReverseMyAccountController {


// @LINE:16
def displayMyAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MyAccountController.displayMyAccount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myaccount"})
      }
   """
)
                        

}
              
}
        


// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:28
class ReverseAssets {


// @LINE:28
def versioned(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:26
// @LINE:25
class ReverseRegisterController {


// @LINE:26
def doRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RegisterController.doRegister(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RegisterController", "doRegister", Seq(), "POST", """""", _prefix + """doRegister""")
)
                      

// @LINE:25
def displayRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RegisterController.displayRegister(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RegisterController", "displayRegister", Seq(), "GET", """ Register Page""", _prefix + """register""")
)
                      

}
                          

// @LINE:10
// @LINE:9
class ReverseLoginController {


// @LINE:10
def postLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.postLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "postLogin", Seq(), "POST", """""", _prefix + """doLogin""")
)
                      

// @LINE:9
def displayLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LoginController.displayLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LoginController", "displayLogin", Seq(), "GET", """ Login Page""", _prefix + """login""")
)
                      

}
                          

// @LINE:13
class ReverseLogoutController {


// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LogoutController.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LogoutController", "logout", Seq(), "GET", """Logout""", _prefix + """logout""")
)
                      

}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:21
def groovy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.groovy(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "groovy", Seq(), "GET", """""", _prefix + """groovy""")
)
                      

// @LINE:19
def java(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.java(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "java", Seq(), "GET", """Java""", _prefix + """java""")
)
                      

// @LINE:20
def scala(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.scala(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "scala", Seq(), "GET", """""", _prefix + """scala""")
)
                      

// @LINE:23
def ruby(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ruby(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "ruby", Seq(), "GET", """""", _prefix + """ruby""")
)
                      

// @LINE:22
def python(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.python(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "python", Seq(), "GET", """""", _prefix + """python""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:16
class ReverseMyAccountController {


// @LINE:16
def displayMyAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MyAccountController.displayMyAccount(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MyAccountController", "displayMyAccount", Seq(), "GET", """ My Account""", _prefix + """myaccount""")
)
                      

}
                          
}
        
    