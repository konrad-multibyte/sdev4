package controllers;

import models.Department;
import models.users.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.departments;

public class HomeController extends Controller {

    public HomeController() {}

    public Result index(Long id) {
        return ok(departments.render(Department.getAll(), Department.get(id), User.find(session().get("email"))));
    }



}