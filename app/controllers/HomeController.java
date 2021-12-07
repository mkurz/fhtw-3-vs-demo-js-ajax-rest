package controllers;

import models.Student;
import play.db.jpa.JPAApi;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;

import javax.inject.Inject;

public class HomeController extends Controller {

    final JPAApi database;

    @Inject
    public HomeController(final JPAApi jpaApi) {
        this.database = jpaApi;
    }

    public Result index() {
        return ok(views.html.index.render()); // index.html an
    }

    public Result student(final Request request, final Integer id) {
        final var student= this.database.withTransaction(em -> (em.find(Student.class, id)));
        student.doSomeBusinessLogic();
        var studentJSON = Json.toJson(student);
        return ok(studentJSON);
    }

}
