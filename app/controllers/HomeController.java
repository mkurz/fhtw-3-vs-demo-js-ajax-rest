package controllers;

import play.mvc.*;
import play.mvc.Http.Request;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result student(Request request, Integer id) {
        return ok("hello student");
    }

}
