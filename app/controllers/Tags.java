package controllers;

import controllers.CRUD;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Tags extends CRUD {

}
