package controllers

import com.google.inject.Inject
import play.api.mvc._
import services.MyRedisService

class Application @Inject()(myRedisService: MyRedisService) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def guiceDIExample = Action {
    myRedisService.doSomething
    Ok(views.html.index("Your new application is ready."))
  }

}
