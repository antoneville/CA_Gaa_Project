package controllers;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import views.html.*;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index() {
	return ok(index.render());
    }
	
    public Result live() {
	return ok(live.render());
    }

    public Result results() {
	return ok(results.render());
    }
    public Result fixtures() {
	return ok(fixtures.render());
    }
     
    public Result player() {
	List<Player> playersList = Player.findAll(); 
	return ok(player.render(playersList));
    }

}
