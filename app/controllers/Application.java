package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Contains methods for each page in the application.
 *
 */

public class Application extends Controller {

  /**
   * The method for the index page.
   *
   * @return A Result of OK.
   *
   */

  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
